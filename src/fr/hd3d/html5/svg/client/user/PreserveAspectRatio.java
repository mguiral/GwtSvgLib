package fr.hd3d.html5.svg.client.user;

import fr.hd3d.html5.svg.client.core.SVGPreserveAspectRatio.AlignmentType;
import fr.hd3d.html5.svg.client.core.SVGPreserveAspectRatio.MeetOrSliceType;

public class PreserveAspectRatio {
    private AlignmentType alignmentType;
    private MeetOrSliceType meetOrSliceType;

    public PreserveAspectRatio(AlignmentType alignmentType) {
        this(alignmentType, null);
    }

    public PreserveAspectRatio(AlignmentType alignmentType, MeetOrSliceType meetOrSliceType) {
        this.alignmentType = alignmentType;
        this.meetOrSliceType = meetOrSliceType;
    }

    public final String getValue() {
        String aspectRatioValue = null;
        if (this.alignmentType != null && this.alignmentType.getCssName() != null) {
            aspectRatioValue = this.alignmentType.getCssName();
            if (this.meetOrSliceType != null && this.meetOrSliceType.getCssName() != null) {
                aspectRatioValue += " " + meetOrSliceType.getCssName();
            }
        }
        return aspectRatioValue;
    }
}
