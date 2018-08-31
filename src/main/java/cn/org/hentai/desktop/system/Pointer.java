package cn.org.hentai.desktop.system;

/**
 * Created by matrixy on 2018/8/31.
 */
public class Pointer
{
    public int x;
    public int y;
    public int style;

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Pointer) return super.equals(obj);
        else
        {
            Pointer p = (Pointer) obj;
            return p.x == this.x && p.y == this.y && p.style == this.style;
        }
    }
}
