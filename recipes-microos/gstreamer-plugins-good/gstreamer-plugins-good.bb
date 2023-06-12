SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "04af61a1f8ca8fb6b0d9014514b00285f79305390df72f41c24e5ab820789775620e43f84f535053b4951bf0a63d6795df5f9ae8fdee93e39615306077401a3f"

RPROVIDES:${PN} += "gst-plugins-good gstreamer-plugins-good gstreamer-plugins-good(aarch-64) gstreamer1(decoder-application/dash+xml)()(64bit) gstreamer1(decoder-application/vnd.ms-sstr+xml)()(64bit) gstreamer1(decoder-application/x-3gp)()(64bit) gstreamer1(decoder-application/x-apetag)()(64bit) gstreamer1(decoder-application/x-hls)()(64bit) gstreamer1(decoder-application/x-icy)()(64bit) gstreamer1(decoder-application/x-id3)()(64bit) gstreamer1(decoder-application/x-navi-animation)()(64bit) gstreamer1(decoder-application/x-rtp)()(64bit) gstreamer1(decoder-application/x-subtitle-avi)()(64bit) gstreamer1(decoder-audio/ac3)()(64bit) gstreamer1(decoder-audio/mpeg)(mpegversion=1)()(64bit) gstreamer1(decoder-audio/mpeg)(mpegversion=1)(layer=1)()(64bit) gstreamer1(decoder-audio/mpeg)(mpegversion=1)(layer=2)()(64bit) gstreamer1(decoder-audio/mpeg)(mpegversion=1)(layer=3)()(64bit) gstreamer1(decoder-audio/mpeg)(mpegversion=2)()(64bit) gstreamer1(decoder-audio/mpeg)(mpegversion=4)()(64bit) gstreamer1(decoder-audio/webm)()(64bit) gstreamer1(decoder-audio/x-ac3)()(64bit) gstreamer1(decoder-audio/x-alaw)()(64bit) gstreamer1(decoder-audio/x-amr-nb-sh)()(64bit) gstreamer1(decoder-audio/x-amr-wb-sh)()(64bit) gstreamer1(decoder-audio/x-au)()(64bit) gstreamer1(decoder-audio/x-dts)()(64bit) gstreamer1(decoder-audio/x-eac3)()(64bit) gstreamer1(decoder-audio/x-flac)()(64bit) gstreamer1(decoder-audio/x-m4a)()(64bit) gstreamer1(decoder-audio/x-matroska)()(64bit) gstreamer1(decoder-audio/x-mulaw)()(64bit) gstreamer1(decoder-audio/x-private1-ac3)()(64bit) gstreamer1(decoder-audio/x-private1-dts)()(64bit) gstreamer1(decoder-audio/x-rf64)()(64bit) gstreamer1(decoder-audio/x-sbc)()(64bit) gstreamer1(decoder-audio/x-speex)()(64bit) gstreamer1(decoder-audio/x-wav)()(64bit) gstreamer1(decoder-audio/x-wavpack)()(64bit) gstreamer1(decoder-audio/x-wavpack-correction)()(64bit) gstreamer1(decoder-image/bmp)()(64bit) gstreamer1(decoder-image/jpeg)()(64bit) gstreamer1(decoder-image/png)()(64bit) gstreamer1(decoder-image/svg)()(64bit) gstreamer1(decoder-image/svg+xml)()(64bit) gstreamer1(decoder-image/tiff)()(64bit) gstreamer1(decoder-image/vnd.wap.wbmp)()(64bit) gstreamer1(decoder-image/x-MS-bmp)()(64bit) gstreamer1(decoder-image/x-bitmap)()(64bit) gstreamer1(decoder-image/x-bmp)()(64bit) gstreamer1(decoder-image/x-cmu-raster)()(64bit) gstreamer1(decoder-image/x-icon)()(64bit) gstreamer1(decoder-image/x-pcx)()(64bit) gstreamer1(decoder-image/x-pixmap)()(64bit) gstreamer1(decoder-image/x-portable-anymap)()(64bit) gstreamer1(decoder-image/x-portable-bitmap)()(64bit) gstreamer1(decoder-image/x-portable-graymap)()(64bit) gstreamer1(decoder-image/x-portable-pixmap)()(64bit) gstreamer1(decoder-image/x-sun-raster)()(64bit) gstreamer1(decoder-image/x-tga)()(64bit) gstreamer1(decoder-multipart/x-mixed-replace)()(64bit) gstreamer1(decoder-video/mj2)()(64bit) gstreamer1(decoder-video/quicktime)()(64bit) gstreamer1(decoder-video/webm)()(64bit) gstreamer1(decoder-video/x-fli)()(64bit) gstreamer1(decoder-video/x-flv)()(64bit) gstreamer1(decoder-video/x-matroska)()(64bit) gstreamer1(decoder-video/x-matroska-3d)()(64bit) gstreamer1(decoder-video/x-msvideo)()(64bit) gstreamer1(decoder-video/x-vp8)()(64bit) gstreamer1(decoder-video/x-vp9)()(64bit) gstreamer1(element-3gppmux)()(64bit) gstreamer1(element-aacparse)()(64bit) gstreamer1(element-ac3parse)()(64bit) gstreamer1(element-agingtv)()(64bit) gstreamer1(element-alawdec)()(64bit) gstreamer1(element-alawenc)()(64bit) gstreamer1(element-alpha)()(64bit) gstreamer1(element-alphacolor)()(64bit) gstreamer1(element-amrparse)()(64bit) gstreamer1(element-apedemux)()(64bit) gstreamer1(element-apev2mux)()(64bit) gstreamer1(element-aspectratiocrop)()(64bit) gstreamer1(element-asteriskh263)()(64bit) gstreamer1(element-audioamplify)()(64bit) gstreamer1(element-audiochebband)()(64bit) gstreamer1(element-audiocheblimit)()(64bit) gstreamer1(element-audiodynamic)()(64bit) gstreamer1(element-audioecho)()(64bit) gstreamer1(element-audiofirfilter)()(64bit) gstreamer1(element-audioiirfilter)()(64bit) gstreamer1(element-audioinvert)()(64bit) gstreamer1(element-audiokaraoke)()(64bit) gstreamer1(element-audiopanorama)()(64bit) gstreamer1(element-audiowsincband)()(64bit) gstreamer1(element-audiowsinclimit)()(64bit) gstreamer1(element-auparse)()(64bit) gstreamer1(element-autoaudiosink)()(64bit) gstreamer1(element-autoaudiosrc)()(64bit) gstreamer1(element-autovideosink)()(64bit) gstreamer1(element-autovideosrc)()(64bit) gstreamer1(element-avidemux)()(64bit) gstreamer1(element-avimux)()(64bit) gstreamer1(element-avisubtitle)()(64bit) gstreamer1(element-breakmydata)()(64bit) gstreamer1(element-capssetter)()(64bit) gstreamer1(element-cpureport)()(64bit) gstreamer1(element-cutter)()(64bit) gstreamer1(element-dashdemux2)()(64bit) gstreamer1(element-dcaparse)()(64bit) gstreamer1(element-deinterlace)()(64bit) gstreamer1(element-deinterleave)()(64bit) gstreamer1(element-dicetv)()(64bit) gstreamer1(element-dtmfsrc)()(64bit) gstreamer1(element-dynudpsink)()(64bit) gstreamer1(element-edgetv)()(64bit) gstreamer1(element-equalizer-10bands)()(64bit) gstreamer1(element-equalizer-3bands)()(64bit) gstreamer1(element-equalizer-nbands)()(64bit) gstreamer1(element-flacdec)()(64bit) gstreamer1(element-flacenc)()(64bit) gstreamer1(element-flacparse)()(64bit) gstreamer1(element-flactag)()(64bit) gstreamer1(element-flvdemux)()(64bit) gstreamer1(element-flvmux)()(64bit) gstreamer1(element-flxdec)()(64bit) gstreamer1(element-gamma)()(64bit) gstreamer1(element-gdkpixbufdec)()(64bit) gstreamer1(element-gdkpixbufoverlay)()(64bit) gstreamer1(element-gdkpixbufsink)()(64bit) gstreamer1(element-goom)()(64bit) gstreamer1(element-goom2k1)()(64bit) gstreamer1(element-hlsdemux2)()(64bit) gstreamer1(element-icydemux)()(64bit) gstreamer1(element-id3demux)()(64bit) gstreamer1(element-id3v2mux)()(64bit) gstreamer1(element-imagefreeze)()(64bit) gstreamer1(element-imagesequencesrc)()(64bit) gstreamer1(element-interleave)()(64bit) gstreamer1(element-ismlmux)()(64bit) gstreamer1(element-jpegdec)()(64bit) gstreamer1(element-jpegenc)()(64bit) gstreamer1(element-lamemp3enc)()(64bit) gstreamer1(element-level)()(64bit) gstreamer1(element-matroskademux)()(64bit) gstreamer1(element-matroskamux)()(64bit) gstreamer1(element-matroskaparse)()(64bit) gstreamer1(element-mj2mux)()(64bit) gstreamer1(element-mp4mux)()(64bit) gstreamer1(element-mpegaudioparse)()(64bit) gstreamer1(element-mpg123audiodec)()(64bit) gstreamer1(element-mssdemux2)()(64bit) gstreamer1(element-mulawdec)()(64bit) gstreamer1(element-mulawenc)()(64bit) gstreamer1(element-multifilesink)()(64bit) gstreamer1(element-multifilesrc)()(64bit) gstreamer1(element-multipartdemux)()(64bit) gstreamer1(element-multipartmux)()(64bit) gstreamer1(element-multiudpsink)()(64bit) gstreamer1(element-navigationtest)()(64bit) gstreamer1(element-navseek)()(64bit) gstreamer1(element-optv)()(64bit) gstreamer1(element-oss4sink)()(64bit) gstreamer1(element-oss4src)()(64bit) gstreamer1(element-osssink)()(64bit) gstreamer1(element-osssrc)()(64bit) gstreamer1(element-pngdec)()(64bit) gstreamer1(element-pngenc)()(64bit) gstreamer1(element-progressreport)()(64bit) gstreamer1(element-pulsesink)()(64bit) gstreamer1(element-pulsesrc)()(64bit) gstreamer1(element-pushfilesrc)()(64bit) gstreamer1(element-qtdemux)()(64bit) gstreamer1(element-qtmoovrecover)()(64bit) gstreamer1(element-qtmux)()(64bit) gstreamer1(element-quarktv)()(64bit) gstreamer1(element-radioactv)()(64bit) gstreamer1(element-revtv)()(64bit) gstreamer1(element-rganalysis)()(64bit) gstreamer1(element-rglimiter)()(64bit) gstreamer1(element-rgvolume)()(64bit) gstreamer1(element-rippletv)()(64bit) gstreamer1(element-rndbuffersize)()(64bit) gstreamer1(element-rtpL16depay)()(64bit) gstreamer1(element-rtpL16pay)()(64bit) gstreamer1(element-rtpL24depay)()(64bit) gstreamer1(element-rtpL24pay)()(64bit) gstreamer1(element-rtpL8depay)()(64bit) gstreamer1(element-rtpL8pay)()(64bit) gstreamer1(element-rtpac3depay)()(64bit) gstreamer1(element-rtpac3pay)()(64bit) gstreamer1(element-rtpamrdepay)()(64bit) gstreamer1(element-rtpamrpay)()(64bit) gstreamer1(element-rtpbin)()(64bit) gstreamer1(element-rtpbvdepay)()(64bit) gstreamer1(element-rtpbvpay)()(64bit) gstreamer1(element-rtpceltdepay)()(64bit) gstreamer1(element-rtpceltpay)()(64bit) gstreamer1(element-rtpdec)()(64bit) gstreamer1(element-rtpdtmfdepay)()(64bit) gstreamer1(element-rtpdtmfmux)()(64bit) gstreamer1(element-rtpdtmfsrc)()(64bit) gstreamer1(element-rtpdvdepay)()(64bit) gstreamer1(element-rtpdvpay)()(64bit) gstreamer1(element-rtpfunnel)()(64bit) gstreamer1(element-rtpg722depay)()(64bit) gstreamer1(element-rtpg722pay)()(64bit) gstreamer1(element-rtpg723depay)()(64bit) gstreamer1(element-rtpg723pay)()(64bit) gstreamer1(element-rtpg726depay)()(64bit) gstreamer1(element-rtpg726pay)()(64bit) gstreamer1(element-rtpg729depay)()(64bit) gstreamer1(element-rtpg729pay)()(64bit) gstreamer1(element-rtpgsmdepay)()(64bit) gstreamer1(element-rtpgsmpay)()(64bit) gstreamer1(element-rtpgstdepay)()(64bit) gstreamer1(element-rtpgstpay)()(64bit) gstreamer1(element-rtph261depay)()(64bit) gstreamer1(element-rtph261pay)()(64bit) gstreamer1(element-rtph263depay)()(64bit) gstreamer1(element-rtph263pay)()(64bit) gstreamer1(element-rtph263pdepay)()(64bit) gstreamer1(element-rtph263ppay)()(64bit) gstreamer1(element-rtph264depay)()(64bit) gstreamer1(element-rtph264pay)()(64bit) gstreamer1(element-rtph265depay)()(64bit) gstreamer1(element-rtph265pay)()(64bit) gstreamer1(element-rtphdrextclientaudiolevel)()(64bit) gstreamer1(element-rtphdrextcolorspace)()(64bit) gstreamer1(element-rtphdrextmid)()(64bit) gstreamer1(element-rtphdrextntp64)()(64bit) gstreamer1(element-rtphdrextrepairedstreamid)()(64bit) gstreamer1(element-rtphdrextstreamid)()(64bit) gstreamer1(element-rtphdrexttwcc)()(64bit) gstreamer1(element-rtpilbcdepay)()(64bit) gstreamer1(element-rtpilbcpay)()(64bit) gstreamer1(element-rtpisacdepay)()(64bit) gstreamer1(element-rtpisacpay)()(64bit) gstreamer1(element-rtpj2kdepay)()(64bit) gstreamer1(element-rtpj2kpay)()(64bit) gstreamer1(element-rtpjitterbuffer)()(64bit) gstreamer1(element-rtpjpegdepay)()(64bit) gstreamer1(element-rtpjpegpay)()(64bit) gstreamer1(element-rtpklvdepay)()(64bit) gstreamer1(element-rtpklvpay)()(64bit) gstreamer1(element-rtpldacpay)()(64bit) gstreamer1(element-rtpmp1sdepay)()(64bit) gstreamer1(element-rtpmp2tdepay)()(64bit) gstreamer1(element-rtpmp2tpay)()(64bit) gstreamer1(element-rtpmp4adepay)()(64bit) gstreamer1(element-rtpmp4apay)()(64bit) gstreamer1(element-rtpmp4gdepay)()(64bit) gstreamer1(element-rtpmp4gpay)()(64bit) gstreamer1(element-rtpmp4vdepay)()(64bit) gstreamer1(element-rtpmp4vpay)()(64bit) gstreamer1(element-rtpmpadepay)()(64bit) gstreamer1(element-rtpmpapay)()(64bit) gstreamer1(element-rtpmparobustdepay)()(64bit) gstreamer1(element-rtpmpvdepay)()(64bit) gstreamer1(element-rtpmpvpay)()(64bit) gstreamer1(element-rtpmux)()(64bit) gstreamer1(element-rtpopusdepay)()(64bit) gstreamer1(element-rtpopuspay)()(64bit) gstreamer1(element-rtppcmadepay)()(64bit) gstreamer1(element-rtppcmapay)()(64bit) gstreamer1(element-rtppcmudepay)()(64bit) gstreamer1(element-rtppcmupay)()(64bit) gstreamer1(element-rtpptdemux)()(64bit) gstreamer1(element-rtpqcelpdepay)()(64bit) gstreamer1(element-rtpqdm2depay)()(64bit) gstreamer1(element-rtpreddec)()(64bit) gstreamer1(element-rtpredenc)()(64bit) gstreamer1(element-rtprtxqueue)()(64bit) gstreamer1(element-rtprtxreceive)()(64bit) gstreamer1(element-rtprtxsend)()(64bit) gstreamer1(element-rtpsbcdepay)()(64bit) gstreamer1(element-rtpsbcpay)()(64bit) gstreamer1(element-rtpsession)()(64bit) gstreamer1(element-rtpsirendepay)()(64bit) gstreamer1(element-rtpsirenpay)()(64bit) gstreamer1(element-rtpspeexdepay)()(64bit) gstreamer1(element-rtpspeexpay)()(64bit) gstreamer1(element-rtpssrcdemux)()(64bit) gstreamer1(element-rtpst2022-1-fecdec)()(64bit) gstreamer1(element-rtpst2022-1-fecenc)()(64bit) gstreamer1(element-rtpstorage)()(64bit) gstreamer1(element-rtpstreamdepay)()(64bit) gstreamer1(element-rtpstreampay)()(64bit) gstreamer1(element-rtpsv3vdepay)()(64bit) gstreamer1(element-rtptheoradepay)()(64bit) gstreamer1(element-rtptheorapay)()(64bit) gstreamer1(element-rtpulpfecdec)()(64bit) gstreamer1(element-rtpulpfecenc)()(64bit) gstreamer1(element-rtpvorbisdepay)()(64bit) gstreamer1(element-rtpvorbispay)()(64bit) gstreamer1(element-rtpvp8depay)()(64bit) gstreamer1(element-rtpvp8pay)()(64bit) gstreamer1(element-rtpvp9depay)()(64bit) gstreamer1(element-rtpvp9pay)()(64bit) gstreamer1(element-rtpvrawdepay)()(64bit) gstreamer1(element-rtpvrawpay)()(64bit) gstreamer1(element-rtpxqtdepay)()(64bit) gstreamer1(element-rtspsrc)()(64bit) gstreamer1(element-sbcparse)()(64bit) gstreamer1(element-scaletempo)()(64bit) gstreamer1(element-shagadelictv)()(64bit) gstreamer1(element-shapewipe)()(64bit) gstreamer1(element-smpte)()(64bit) gstreamer1(element-smptealpha)()(64bit) gstreamer1(element-souphttpclientsink)()(64bit) gstreamer1(element-souphttpsrc)()(64bit) gstreamer1(element-spectrum)()(64bit) gstreamer1(element-speexdec)()(64bit) gstreamer1(element-speexenc)()(64bit) gstreamer1(element-splitfilesrc)()(64bit) gstreamer1(element-splitmuxsink)()(64bit) gstreamer1(element-splitmuxsrc)()(64bit) gstreamer1(element-stereo)()(64bit) gstreamer1(element-streaktv)()(64bit) gstreamer1(element-taginject)()(64bit) gstreamer1(element-testsink)()(64bit) gstreamer1(element-twolamemp2enc)()(64bit) gstreamer1(element-udpsink)()(64bit) gstreamer1(element-udpsrc)()(64bit) gstreamer1(element-v4l2radio)()(64bit) gstreamer1(element-v4l2sink)()(64bit) gstreamer1(element-v4l2src)()(64bit) gstreamer1(element-vertigotv)()(64bit) gstreamer1(element-videobalance)()(64bit) gstreamer1(element-videobox)()(64bit) gstreamer1(element-videocrop)()(64bit) gstreamer1(element-videoflip)()(64bit) gstreamer1(element-videomedian)()(64bit) gstreamer1(element-videomixer)()(64bit) gstreamer1(element-vp8dec)()(64bit) gstreamer1(element-vp8enc)()(64bit) gstreamer1(element-vp9dec)()(64bit) gstreamer1(element-vp9enc)()(64bit) gstreamer1(element-warptv)()(64bit) gstreamer1(element-wavenc)()(64bit) gstreamer1(element-wavpackdec)()(64bit) gstreamer1(element-wavpackenc)()(64bit) gstreamer1(element-wavpackparse)()(64bit) gstreamer1(element-wavparse)()(64bit) gstreamer1(element-webmmux)()(64bit) gstreamer1(element-ximagesrc)()(64bit) gstreamer1(element-xingmux)()(64bit) gstreamer1(element-y4menc)()(64bit) gstreamer1(encoder-application/x-rtp)()(64bit) gstreamer1(encoder-application/x-yuv4mpeg)(y4mversion=2)()(64bit) gstreamer1(encoder-audio/mpeg)(mpegversion=1)(layer=1)()(64bit) gstreamer1(encoder-audio/mpeg)(mpegversion=1)(layer=2)()(64bit) gstreamer1(encoder-audio/mpeg)(mpegversion=1)(layer=3)()(64bit) gstreamer1(encoder-audio/webm)()(64bit) gstreamer1(encoder-audio/x-alaw)()(64bit) gstreamer1(encoder-audio/x-flac)()(64bit) gstreamer1(encoder-audio/x-matroska)()(64bit) gstreamer1(encoder-audio/x-mulaw)()(64bit) gstreamer1(encoder-audio/x-rf64)()(64bit) gstreamer1(encoder-audio/x-speex)()(64bit) gstreamer1(encoder-audio/x-wav)()(64bit) gstreamer1(encoder-image/jpeg)()(64bit) gstreamer1(encoder-image/png)()(64bit) gstreamer1(encoder-video/mj2)()(64bit) gstreamer1(encoder-video/quicktime)()(64bit) gstreamer1(encoder-video/quicktime)(variant=3gpp)()(64bit) gstreamer1(encoder-video/quicktime)(variant=apple)()(64bit) gstreamer1(encoder-video/quicktime)(variant=iso)()(64bit) gstreamer1(encoder-video/quicktime)(variant=iso-fragmented)()(64bit) gstreamer1(encoder-video/webm)()(64bit) gstreamer1(encoder-video/x-flv)()(64bit) gstreamer1(encoder-video/x-matroska)()(64bit) gstreamer1(encoder-video/x-matroska-3d)()(64bit) gstreamer1(encoder-video/x-msvideo)()(64bit) gstreamer1(encoder-video/x-vp8)()(64bit) gstreamer1(encoder-video/x-vp9)()(64bit) gstreamer1(urisink-udp)()(64bit) gstreamer1(urisource-http)()(64bit) gstreamer1(urisource-https)()(64bit) gstreamer1(urisource-icy)()(64bit) gstreamer1(urisource-icyx)()(64bit) gstreamer1(urisource-imagesequence)()(64bit) gstreamer1(urisource-multifile)()(64bit) gstreamer1(urisource-pushfile)()(64bit) gstreamer1(urisource-radio)()(64bit) gstreamer1(urisource-rtsp)()(64bit) gstreamer1(urisource-rtsp-sdp)()(64bit) gstreamer1(urisource-rtsph)()(64bit) gstreamer1(urisource-rtsps)()(64bit) gstreamer1(urisource-rtspsh)()(64bit) gstreamer1(urisource-rtspst)()(64bit) gstreamer1(urisource-rtspsu)()(64bit) gstreamer1(urisource-rtspt)()(64bit) gstreamer1(urisource-rtspu)()(64bit) gstreamer1(urisource-splitfile)()(64bit) gstreamer1(urisource-splitmux)()(64bit) gstreamer1(urisource-udp)()(64bit) gstreamer1(urisource-v4l2)()(64bit) libgstadaptivedemux2.so()(64bit) libgstalaw.so()(64bit) libgstalpha.so()(64bit) libgstalphacolor.so()(64bit) libgstapetag.so()(64bit) libgstaudiofx.so()(64bit) libgstaudioparsers.so()(64bit) libgstauparse.so()(64bit) libgstautodetect.so()(64bit) libgstavi.so()(64bit) libgstcutter.so()(64bit) libgstdebug.so()(64bit) libgstdeinterlace.so()(64bit) libgstdtmf.so()(64bit) libgsteffectv.so()(64bit) libgstequalizer.so()(64bit) libgstflac.so()(64bit) libgstflv.so()(64bit) libgstflxdec.so()(64bit) libgstgdkpixbuf.so()(64bit) libgstgoom.so()(64bit) libgstgoom2k1.so()(64bit) libgsticydemux.so()(64bit) libgstid3demux.so()(64bit) libgstimagefreeze.so()(64bit) libgstinterleave.so()(64bit) libgstisomp4.so()(64bit) libgstjpeg.so()(64bit) libgstlame.so()(64bit) libgstlevel.so()(64bit) libgstmatroska.so()(64bit) libgstmpg123.so()(64bit) libgstmulaw.so()(64bit) libgstmultifile.so()(64bit) libgstmultipart.so()(64bit) libgstnavigationtest.so()(64bit) libgstoss4.so()(64bit) libgstossaudio.so()(64bit) libgstpng.so()(64bit) libgstpulseaudio.so()(64bit) libgstreplaygain.so()(64bit) libgstrtp.so()(64bit) libgstrtpmanager.so()(64bit) libgstrtsp.so()(64bit) libgstshapewipe.so()(64bit) libgstsmpte.so()(64bit) libgstsoup.so()(64bit) libgstspectrum.so()(64bit) libgstspeex.so()(64bit) libgsttaglib.so()(64bit) libgsttwolame.so()(64bit) libgstudp.so()(64bit) libgstvideo4linux2.so()(64bit) libgstvideobox.so()(64bit) libgstvideocrop.so()(64bit) libgstvideofilter.so()(64bit) libgstvideomixer.so()(64bit) libgstvpx.so()(64bit) libgstwavenc.so()(64bit) libgstwavpack.so()(64bit) libgstwavparse.so()(64bit) libgstximagesrc.so()(64bit) libgstxingmux.so()(64bit) libgsty4menc.so()(64bit) metainfo() metainfo(gstreamer-plugins-good.appdata.xml)"
RDEPENDS:${PN} += "gstreamer gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libX11.so.6()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstfft-1.0.so.0()(64bit) libgstnet-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstriff-1.0.so.0()(64bit) libgstrtp-1.0.so.0()(64bit) libgstrtsp-1.0.so.0()(64bit) libgstsdp-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgudev-1.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmp3lame.so.0()(64bit) libmpg123.so.0()(64bit) liborc-0.4.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libspeex.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libtag.so.1()(64bit) libtwolame.so.0()(64bit) libv4l2.so.0()(64bit) libvpx.so.8()(64bit) libwavpack.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) libz.so.1()(64bit)"

inherit rpm
