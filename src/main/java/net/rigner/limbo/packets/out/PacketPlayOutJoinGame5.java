package net.rigner.limbo.packets.out;

import net.rigner.limbo.packets.PacketSerializer;

import java.io.IOException;

public class PacketPlayOutJoinGame5 implements PacketOut
{
    private int entityId;
    private byte gameMode;
    private byte dimension;
    private byte difficulty;
    private byte maxPlayers;
    private String levelType;

    public PacketPlayOutJoinGame5(int entityId, byte gameMode, byte dimension, byte difficulty, byte maxPlayers, String levelType)
    {
        this.entityId = entityId;
        this.gameMode = gameMode;
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.maxPlayers = maxPlayers;
        this.levelType = levelType;
    }

    @Override
    public void write(PacketSerializer packetSerializer) throws IOException
    {
        packetSerializer.writeInt(this.entityId);
        packetSerializer.writeByte(this.gameMode);
        packetSerializer.writeByte(this.dimension);
        packetSerializer.writeByte(this.difficulty);
        packetSerializer.writeByte(this.maxPlayers);
        packetSerializer.writeString(this.levelType);
    }
}
