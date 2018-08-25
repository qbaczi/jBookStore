package pl.sda.clone;

public class Segment {

    Point startPoint;
    Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint);
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Segment segment = (Segment) o;

        return segmentLength(segment) == segmentLength(this);
    }

        private double segmentLength(Segment aSegment){
            return Math.sqrt((aSegment.getStartPoint().getX() - aSegment.getEndPoint().getX())*(aSegment.getStartPoint().getX() - aSegment.getEndPoint().getX())
                    + (aSegment.getStartPoint().getY() - aSegment.getEndPoint().getY()) * (aSegment.getStartPoint().getY() - aSegment.getEndPoint().getY()));
        }

    @Override
    public String toString() {
        return "Segment{" +
                "length=" + segmentLength(this) +
                '}';
    }
}
