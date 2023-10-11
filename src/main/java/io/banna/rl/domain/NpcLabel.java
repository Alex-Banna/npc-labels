package io.banna.rl.domain;

import lombok.Data;

import java.awt.*;

@Data
public class NpcLabel
{
    private String label;
    private Integer itemIconId;
    private String itemIconName;
    private Color color;
}
