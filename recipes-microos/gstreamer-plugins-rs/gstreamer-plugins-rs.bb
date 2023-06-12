SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new \
plug-ins. \
 \
This package provides various plugins written in Rust."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.6"

RPM_NAME = "gstreamer-plugins-rs-0.10.6-1.1.aarch64.rpm"
RPM_HASH = "0170e84e69806095786ddf285eed079b23f7e58e4cd9fcae59cc1f2ac23712bd5206c70b3277df7af93c7ea0179d2fb015173d4c5b9019aa7e261f05796ba675"

RPROVIDES:${PN} += "gstreamer-plugins-rs \
gstreamer-plugins-rs(aarch-64) \
gstreamer1(decoder-application/x-mcc)(version=1)()(64bit) \
gstreamer1(decoder-application/x-mcc)(version=2)()(64bit) \
gstreamer1(decoder-application/x-ndi)()(64bit) \
gstreamer1(decoder-application/x-rtp)()(64bit) \
gstreamer1(decoder-application/x-scc)()(64bit) \
gstreamer1(decoder-audio/x-flac)()(64bit) \
gstreamer1(decoder-audio/x-vorbis)()(64bit) \
gstreamer1(decoder-image/webp)()(64bit) \
gstreamer1(decoder-video/x-av1)()(64bit) \
gstreamer1(decoder-video/x-cdg)()(64bit) \
gstreamer1(decoder-video/x-ffv)(ffvversion=1)()(64bit) \
gstreamer1(element-audioloudnorm)()(64bit) \
gstreamer1(element-audiornnoise)()(64bit) \
gstreamer1(element-awss3hlssink)()(64bit) \
gstreamer1(element-awss3sink)()(64bit) \
gstreamer1(element-awss3src)()(64bit) \
gstreamer1(element-awstranscribeparse)()(64bit) \
gstreamer1(element-awstranscriber)()(64bit) \
gstreamer1(element-ccdetect)()(64bit) \
gstreamer1(element-cdgdec)()(64bit) \
gstreamer1(element-cdgparse)()(64bit) \
gstreamer1(element-cea608overlay)()(64bit) \
gstreamer1(element-cea608tojson)()(64bit) \
gstreamer1(element-cea608tott)()(64bit) \
gstreamer1(element-claxondec)()(64bit) \
gstreamer1(element-cmafmux)()(64bit) \
gstreamer1(element-colordetect)()(64bit) \
gstreamer1(element-dashmp4mux)()(64bit) \
gstreamer1(element-dav1ddec)()(64bit) \
gstreamer1(element-ebur128level)()(64bit) \
gstreamer1(element-fallbacksrc)()(64bit) \
gstreamer1(element-fallbackswitch)()(64bit) \
gstreamer1(element-ffv1dec)()(64bit) \
gstreamer1(element-gifenc)()(64bit) \
gstreamer1(element-gtk4paintablesink)()(64bit) \
gstreamer1(element-hlssink3)()(64bit) \
gstreamer1(element-hrtfrender)()(64bit) \
gstreamer1(element-hsvdetector)()(64bit) \
gstreamer1(element-hsvfilter)()(64bit) \
gstreamer1(element-isofmp4mux)()(64bit) \
gstreamer1(element-isomp4mux)()(64bit) \
gstreamer1(element-jsongstenc)()(64bit) \
gstreamer1(element-jsongstparse)()(64bit) \
gstreamer1(element-jsontovtt)()(64bit) \
gstreamer1(element-lewtondec)()(64bit) \
gstreamer1(element-livesync)()(64bit) \
gstreamer1(element-mccenc)()(64bit) \
gstreamer1(element-mccparse)()(64bit) \
gstreamer1(element-ndisink)()(64bit) \
gstreamer1(element-ndisinkcombiner)()(64bit) \
gstreamer1(element-ndisrc)()(64bit) \
gstreamer1(element-ndisrcdemux)()(64bit) \
gstreamer1(element-onviffmp4mux)()(64bit) \
gstreamer1(element-onvifmetadatacombiner)()(64bit) \
gstreamer1(element-onvifmetadataoverlay)()(64bit) \
gstreamer1(element-onvifmetadataparse)()(64bit) \
gstreamer1(element-onvifmp4mux)()(64bit) \
gstreamer1(element-raptorqdec)()(64bit) \
gstreamer1(element-raptorqenc)()(64bit) \
gstreamer1(element-rav1enc)()(64bit) \
gstreamer1(element-regex)()(64bit) \
gstreamer1(element-reqwesthttpsrc)()(64bit) \
gstreamer1(element-roundedcorners)()(64bit) \
gstreamer1(element-rsaudioecho)()(64bit) \
gstreamer1(element-rsfilesink)()(64bit) \
gstreamer1(element-rsfilesrc)()(64bit) \
gstreamer1(element-rsflvdemux)()(64bit) \
gstreamer1(element-rspngenc)()(64bit) \
gstreamer1(element-rswebpdec)()(64bit) \
gstreamer1(element-rtpav1depay)()(64bit) \
gstreamer1(element-rtpav1pay)()(64bit) \
gstreamer1(element-rtpgccbwe)()(64bit) \
gstreamer1(element-rtponvifmetadatadepay)()(64bit) \
gstreamer1(element-rtponvifmetadatapay)()(64bit) \
gstreamer1(element-rusotos3sink)()(64bit) \
gstreamer1(element-rusotos3src)()(64bit) \
gstreamer1(element-sccenc)()(64bit) \
gstreamer1(element-sccparse)()(64bit) \
gstreamer1(element-sodiumdecrypter)()(64bit) \
gstreamer1(element-sodiumencrypter)()(64bit) \
gstreamer1(element-spotifyaudiosrc)()(64bit) \
gstreamer1(element-textahead)()(64bit) \
gstreamer1(element-textwrap)()(64bit) \
gstreamer1(element-togglerecord)()(64bit) \
gstreamer1(element-transcriberbin)()(64bit) \
gstreamer1(element-ts-appsrc)()(64bit) \
gstreamer1(element-ts-audiotestsrc)()(64bit) \
gstreamer1(element-ts-input-selector)()(64bit) \
gstreamer1(element-ts-jitterbuffer)()(64bit) \
gstreamer1(element-ts-proxysink)()(64bit) \
gstreamer1(element-ts-proxysrc)()(64bit) \
gstreamer1(element-ts-queue)()(64bit) \
gstreamer1(element-ts-tcpclientsrc)()(64bit) \
gstreamer1(element-ts-udpsink)()(64bit) \
gstreamer1(element-ts-udpsrc)()(64bit) \
gstreamer1(element-tttocea608)()(64bit) \
gstreamer1(element-tttojson)()(64bit) \
gstreamer1(element-uriplaylistbin)()(64bit) \
gstreamer1(element-videocompare)()(64bit) \
gstreamer1(element-webrtcsink)()(64bit) \
gstreamer1(element-webrtcsrc)()(64bit) \
gstreamer1(element-whepsrc)()(64bit) \
gstreamer1(element-whipsink)()(64bit) \
gstreamer1(encoder-application/x-mcc)()(64bit) \
gstreamer1(encoder-application/x-rtp)()(64bit) \
gstreamer1(encoder-application/x-scc)()(64bit) \
gstreamer1(encoder-image/gif)()(64bit) \
gstreamer1(encoder-image/png)()(64bit) \
gstreamer1(encoder-video/quicktime)(variant=cmaf)()(64bit) \
gstreamer1(encoder-video/quicktime)(variant=iso)()(64bit) \
gstreamer1(encoder-video/quicktime)(variant=iso-fragmented)()(64bit) \
gstreamer1(encoder-video/x-av1)()(64bit) \
gstreamer1(urisink-file)()(64bit) \
gstreamer1(urisink-s3)()(64bit) \
gstreamer1(urisource-file)()(64bit) \
gstreamer1(urisource-gstwebrtc)()(64bit) \
gstreamer1(urisource-gstwebrtcs)()(64bit) \
gstreamer1(urisource-http)()(64bit) \
gstreamer1(urisource-https)()(64bit) \
gstreamer1(urisource-s3)()(64bit) \
gstreamer1(urisource-spotify)()(64bit) \
libgstaws.so()(64bit) \
libgstcdg.so()(64bit) \
libgstclaxon.so()(64bit) \
libgstdav1d.so()(64bit) \
libgstfallbackswitch.so()(64bit) \
libgstffv1.so()(64bit) \
libgstfmp4.so()(64bit) \
libgstgif.so()(64bit) \
libgstgtk4.so()(64bit) \
libgsthlssink3.so()(64bit) \
libgsthsv.so()(64bit) \
libgstjson.so()(64bit) \
libgstlewton.so()(64bit) \
libgstlivesync.so()(64bit) \
libgstmp4.so()(64bit) \
libgstndi.so()(64bit) \
libgstraptorq.so()(64bit) \
libgstrav1e.so()(64bit) \
libgstregex.so()(64bit) \
libgstreqwest.so()(64bit) \
libgstrsaudiofx.so()(64bit) \
libgstrsclosedcaption.so()(64bit) \
libgstrsfile.so()(64bit) \
libgstrsflv.so()(64bit) \
libgstrsonvif.so()(64bit) \
libgstrspng.so()(64bit) \
libgstrsrtp.so()(64bit) \
libgstrstracers.so()(64bit) \
libgstrsvideofx.so()(64bit) \
libgstrswebp.so()(64bit) \
libgstrswebrtc.so()(64bit) \
libgstsodium.so()(64bit) \
libgstspotify.so()(64bit) \
libgsttextahead.so()(64bit) \
libgsttextwrap.so()(64bit) \
libgstthreadshare.so()(64bit) \
libgsttogglerecord.so()(64bit) \
libgsturiplaylistbin.so()(64bit) \
libgstwebrtchttp.so()(64bit) \
metainfo() \
metainfo(gstreamer-plugins-rs.appdata.xml)"
RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdav1d.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstnet-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstrtp-1.0.so.0()(64bit) \
libgstsdp-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgstwebrtc-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libwebpdemux.so.2()(64bit)"

inherit rpm
