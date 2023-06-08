SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-base-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "e3f51c67a69349294c34fcbf901ca983a2db8df77eca1d0646cfccc460cda89d95d45ed936bdaa8491f71f068be3848f2b8db52d307924bc6ca53bc3d4a4b37e"

RPROVIDES:${PN} += "gst-plugins-base gstreamer-plugins-base gstreamer-plugins-base(aarch-64) gstreamer1(decoder-application/kate)()(64bit) gstreamer1(decoder-application/ogg)()(64bit) gstreamer1(decoder-application/x-ass)()(64bit) gstreamer1(decoder-application/x-ogg-avi)()(64bit) gstreamer1(decoder-application/x-ogm-audio)()(64bit) gstreamer1(decoder-application/x-ogm-text)()(64bit) gstreamer1(decoder-application/x-ogm-video)()(64bit) gstreamer1(decoder-application/x-ssa)()(64bit) gstreamer1(decoder-application/x-subtitle)()(64bit) gstreamer1(decoder-application/x-subtitle-dks)()(64bit) gstreamer1(decoder-application/x-subtitle-lrc)()(64bit) gstreamer1(decoder-application/x-subtitle-mpl2)()(64bit) gstreamer1(decoder-application/x-subtitle-qttext)()(64bit) gstreamer1(decoder-application/x-subtitle-sami)()(64bit) gstreamer1(decoder-application/x-subtitle-tmplayer)()(64bit) gstreamer1(decoder-application/x-subtitle-vtt)()(64bit) gstreamer1(decoder-audio/ogg)()(64bit) gstreamer1(decoder-audio/x-opus)()(64bit) gstreamer1(decoder-audio/x-unaligned-raw)()(64bit) gstreamer1(decoder-audio/x-vorbis)()(64bit) gstreamer1(decoder-video/ogg)()(64bit) gstreamer1(decoder-video/x-theora)()(64bit) gstreamer1(decoder-video/x-unaligned-raw)()(64bit) gstreamer1(element-adder)()(64bit) gstreamer1(element-alsamidisrc)()(64bit) gstreamer1(element-alsasink)()(64bit) gstreamer1(element-alsasrc)()(64bit) gstreamer1(element-appsink)()(64bit) gstreamer1(element-appsrc)()(64bit) gstreamer1(element-audioconvert)()(64bit) gstreamer1(element-audiointerleave)()(64bit) gstreamer1(element-audiomixer)()(64bit) gstreamer1(element-audiorate)()(64bit) gstreamer1(element-audioresample)()(64bit) gstreamer1(element-audiotestsrc)()(64bit) gstreamer1(element-cdparanoiasrc)()(64bit) gstreamer1(element-clockoverlay)()(64bit) gstreamer1(element-compositor)()(64bit) gstreamer1(element-decodebin)()(64bit) gstreamer1(element-decodebin3)()(64bit) gstreamer1(element-encodebin)()(64bit) gstreamer1(element-encodebin2)()(64bit) gstreamer1(element-giosink)()(64bit) gstreamer1(element-giosrc)()(64bit) gstreamer1(element-giostreamsink)()(64bit) gstreamer1(element-giostreamsrc)()(64bit) gstreamer1(element-glalpha)()(64bit) gstreamer1(element-glcolorbalance)()(64bit) gstreamer1(element-glcolorconvert)()(64bit) gstreamer1(element-glcolorscale)()(64bit) gstreamer1(element-gldeinterlace)()(64bit) gstreamer1(element-gldifferencematte)()(64bit) gstreamer1(element-gldownload)()(64bit) gstreamer1(element-gleffects)()(64bit) gstreamer1(element-gleffects_blur)()(64bit) gstreamer1(element-gleffects_bulge)()(64bit) gstreamer1(element-gleffects_fisheye)()(64bit) gstreamer1(element-gleffects_glow)()(64bit) gstreamer1(element-gleffects_heat)()(64bit) gstreamer1(element-gleffects_identity)()(64bit) gstreamer1(element-gleffects_laplacian)()(64bit) gstreamer1(element-gleffects_lumaxpro)()(64bit) gstreamer1(element-gleffects_mirror)()(64bit) gstreamer1(element-gleffects_sepia)()(64bit) gstreamer1(element-gleffects_sin)()(64bit) gstreamer1(element-gleffects_sobel)()(64bit) gstreamer1(element-gleffects_square)()(64bit) gstreamer1(element-gleffects_squeeze)()(64bit) gstreamer1(element-gleffects_stretch)()(64bit) gstreamer1(element-gleffects_tunnel)()(64bit) gstreamer1(element-gleffects_twirl)()(64bit) gstreamer1(element-gleffects_xpro)()(64bit) gstreamer1(element-gleffects_xray)()(64bit) gstreamer1(element-glfilterapp)()(64bit) gstreamer1(element-glfilterbin)()(64bit) gstreamer1(element-glfiltercube)()(64bit) gstreamer1(element-glfilterglass)()(64bit) gstreamer1(element-glimagesink)()(64bit) gstreamer1(element-glimagesinkelement)()(64bit) gstreamer1(element-glmixerbin)()(64bit) gstreamer1(element-glmosaic)()(64bit) gstreamer1(element-gloverlay)()(64bit) gstreamer1(element-gloverlaycompositor)()(64bit) gstreamer1(element-glshader)()(64bit) gstreamer1(element-glsinkbin)()(64bit) gstreamer1(element-glsrcbin)()(64bit) gstreamer1(element-glstereomix)()(64bit) gstreamer1(element-glstereosplit)()(64bit) gstreamer1(element-gltestsrc)()(64bit) gstreamer1(element-gltransformation)()(64bit) gstreamer1(element-glupload)()(64bit) gstreamer1(element-glvideoflip)()(64bit) gstreamer1(element-glvideomixer)()(64bit) gstreamer1(element-glvideomixerelement)()(64bit) gstreamer1(element-glviewconvert)()(64bit) gstreamer1(element-liveadder)()(64bit) gstreamer1(element-multifdsink)()(64bit) gstreamer1(element-multisocketsink)()(64bit) gstreamer1(element-oggaviparse)()(64bit) gstreamer1(element-oggdemux)()(64bit) gstreamer1(element-oggmux)()(64bit) gstreamer1(element-oggparse)()(64bit) gstreamer1(element-ogmaudioparse)()(64bit) gstreamer1(element-ogmtextparse)()(64bit) gstreamer1(element-ogmvideoparse)()(64bit) gstreamer1(element-opusdec)()(64bit) gstreamer1(element-opusenc)()(64bit) gstreamer1(element-overlaycomposition)()(64bit) gstreamer1(element-parsebin)()(64bit) gstreamer1(element-playbin)()(64bit) gstreamer1(element-playbin3)()(64bit) gstreamer1(element-playsink)()(64bit) gstreamer1(element-rawaudioparse)()(64bit) gstreamer1(element-rawvideoparse)()(64bit) gstreamer1(element-socketsrc)()(64bit) gstreamer1(element-ssaparse)()(64bit) gstreamer1(element-streamsynchronizer)()(64bit) gstreamer1(element-subparse)()(64bit) gstreamer1(element-subtitleoverlay)()(64bit) gstreamer1(element-tcpclientsink)()(64bit) gstreamer1(element-tcpclientsrc)()(64bit) gstreamer1(element-tcpserversink)()(64bit) gstreamer1(element-tcpserversrc)()(64bit) gstreamer1(element-textoverlay)()(64bit) gstreamer1(element-textrender)()(64bit) gstreamer1(element-theoradec)()(64bit) gstreamer1(element-theoraenc)()(64bit) gstreamer1(element-theoraparse)()(64bit) gstreamer1(element-timeoverlay)()(64bit) gstreamer1(element-unalignedaudioparse)()(64bit) gstreamer1(element-unalignedvideoparse)()(64bit) gstreamer1(element-uridecodebin)()(64bit) gstreamer1(element-uridecodebin3)()(64bit) gstreamer1(element-urisourcebin)()(64bit) gstreamer1(element-videoconvert)()(64bit) gstreamer1(element-videoconvertscale)()(64bit) gstreamer1(element-videorate)()(64bit) gstreamer1(element-videoscale)()(64bit) gstreamer1(element-videotestsrc)()(64bit) gstreamer1(element-volume)()(64bit) gstreamer1(element-vorbisdec)()(64bit) gstreamer1(element-vorbisenc)()(64bit) gstreamer1(element-vorbisparse)()(64bit) gstreamer1(element-vorbistag)()(64bit) gstreamer1(element-ximagesink)()(64bit) gstreamer1(element-xvimagesink)()(64bit) gstreamer1(encoder-application/ogg)()(64bit) gstreamer1(encoder-audio/ogg)()(64bit) gstreamer1(encoder-audio/x-opus)()(64bit) gstreamer1(encoder-audio/x-vorbis)()(64bit) gstreamer1(encoder-video/ogg)()(64bit) gstreamer1(encoder-video/x-theora)()(64bit) gstreamer1(urisink-appsink)()(64bit) gstreamer1(urisink-file)()(64bit) gstreamer1(urisink-resource)()(64bit) gstreamer1(urisource-appsrc)()(64bit) gstreamer1(urisource-cdda)()(64bit) gstreamer1(urisource-file)()(64bit) gstreamer1(urisource-resource)()(64bit) libgstadder.so()(64bit) libgstalsa.so()(64bit) libgstapp.so()(64bit) libgstaudioconvert.so()(64bit) libgstaudiomixer.so()(64bit) libgstaudiorate.so()(64bit) libgstaudioresample.so()(64bit) libgstaudiotestsrc.so()(64bit) libgstcdparanoia.so()(64bit) libgstcompositor.so()(64bit) libgstencoding.so()(64bit) libgstgio.so()(64bit) libgstlibvisual.so()(64bit) libgstogg.so()(64bit) libgstopengl.so()(64bit) libgstopus.so()(64bit) libgstoverlaycomposition.so()(64bit) libgstpango.so()(64bit) libgstpbtypes.so()(64bit) libgstplayback.so()(64bit) libgstrawparse.so()(64bit) libgstsubparse.so()(64bit) libgsttcp.so()(64bit) libgsttheora.so()(64bit) libgsttypefindfunctions.so()(64bit) libgstvideoconvertscale.so()(64bit) libgstvideorate.so()(64bit) libgstvideotestsrc.so()(64bit) libgstvolume.so()(64bit) libgstvorbis.so()(64bit) libgstximagesink.so()(64bit) libgstxvimagesink.so()(64bit) metainfo() metainfo(gstreamer-plugins-base.appdata.xml)"
RDEPENDS:${PN} += "gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXi.so.6()(64bit) libXv.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libasound.so.2(ALSA_0.9.0rc8)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcdda_interface.so.0()(64bit) libcdda_paranoia.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgraphene-1.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstcontroller-1.0.so.0()(64bit) libgstgl-1.0.so.0()(64bit) libgstnet-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstriff-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libogg.so.0()(64bit) libopus.so.0()(64bit) liborc-0.4.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtheoradec.so.1()(64bit) libtheoradec.so.1(libtheoradec_1.0)(64bit) libtheoraenc.so.1()(64bit) libtheoraenc.so.1(libtheoraenc_1.0)(64bit) libvisual-0.4.so.0()(64bit) libvorbis.so.0()(64bit) libvorbisenc.so.2()(64bit)"

inherit rpm
