package rtda.heap;

import rtda.Slot;

import java.lang.ref.Reference;

public class Slots {

    private Slot[] slots;

    public Slots(int slotCount) {
        if (slotCount > 0) {
            slots = new Slot[slotCount];
            for (int i = 0; i < slotCount; i++) {
                slots[i] = new Slot();
            }
        }
    }

    public void setInt(int idx, int val) {
        this.slots[idx].setNum(val);
    }

    public int getInt(int idx) {
        return this.slots[idx].getNumInt();
    }

    public void setFloat(int idx, float val) {
        this.slots[idx].setNum((int) val);
    }

    public float getFloat(int idx) {
        return this.slots[idx].getNumInt();
    }

    public void setLong(int idx, long val) {
        this.slots[idx].setNum((int) val);
        this.slots[idx + 1].setNum((int) (val >> 32));
    }

    public long getLong(int idx) {
        int low = this.slots[idx].getNumInt();
        int high = this.slots[idx + 1].getNumInt();
        return (long) high << 32 | (long) low;
    }

    public void setDouble(int idx, double val) {
        this.setLong(idx, (long) val);
    }

    public Double getDouble(int idx) {
        return (double) this.getLong(idx);
    }

    public void setRef(int idx, java.lang.Object ref) {
        this.slots[idx].setRef((Reference) ref);
    }

    public java.lang.Object getRef(int idx){
        return this.slots[idx].getRef();
    }

}
