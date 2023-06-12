SUMMARY = "Remote Desktop Viewer client library"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the shared \
libraries used by the client."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libfreerdp2-2-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "00b0cd38633a600b43f91a151e7f0ba660a1ebd3236eafb1e6a80b9d079d1cffa3a246531e69db1e23c553a6f1ea48dcc4c81d3b69bf05464351452b7fb7d563"

RPROVIDES:${PN} += "libainput-client.so()(64bit) libaudin-client-alsa.so()(64bit) libaudin-client-oss.so()(64bit) libaudin-client-pulse.so()(64bit) libaudin-client.so()(64bit) libdisp-client.so()(64bit) libdrive-client.so()(64bit) libecho-client.so()(64bit) libfreerdp libfreerdp-client2.so.2()(64bit) libfreerdp-server2.so.2()(64bit) libfreerdp-shadow-subsystem2.so.2()(64bit) libfreerdp-shadow2.so.2()(64bit) libfreerdp2 libfreerdp2-2 libfreerdp2-2(aarch-64) libfreerdp2.so.2()(64bit) libgeometry-client.so()(64bit) libparallel-client.so()(64bit) libprinter-client-cups.so()(64bit) libprinter-client.so()(64bit) librdp2tcp-client.so()(64bit) librdpei-client.so()(64bit) librdpgfx-client.so()(64bit) librdpsnd-client-alsa.so()(64bit) librdpsnd-client-fake.so()(64bit) librdpsnd-client-oss.so()(64bit) librdpsnd-client-proxy.so()(64bit) librdpsnd-client-pulse.so()(64bit) libserial-client.so()(64bit) liburbdrc-client-libusb.so()(64bit) liburbdrc-client.so()(64bit) libvideo-client.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXtst.so.6()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.32)(64bit) libcairo.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcups.so.2()(64bit) libgsm.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libmp3lame.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsoxr.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libusb-1.0.so.0()(64bit) libwinpr-tools2.so.2()(64bit) libwinpr2.so.2()(64bit) libxkbfile.so.1()(64bit)"

inherit rpm
