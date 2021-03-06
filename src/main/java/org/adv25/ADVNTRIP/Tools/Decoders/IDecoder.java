package org.adv25.ADVNTRIP.Tools.Decoders;

import org.adv25.ADVNTRIP.Tools.MessagePack;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface IDecoder {

    MessagePack separate(ByteBuffer bb) throws IOException;

    DecoderType getType();

}
