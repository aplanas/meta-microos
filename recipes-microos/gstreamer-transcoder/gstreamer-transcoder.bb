SUMMARY = "GStreamer Transcoding API"
DESCRIPTION = "GStreamer Transcoding cli tool and API"
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-transcoder-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "1cc51149206232a7a7e506d7b3f98a38dd4ff0221f972c27074c68ce0bce1bd52dbb1fdf59681e1042a5accf6f0c640cd9b156db07be76a2b80eb7b561477ddc"

RPROVIDES:${PN} += "gstreamer-transcoder gstreamer-transcoder(aarch-64) gstreamer1(element-transcodebin)()(64bit) gstreamer1(element-uritranscodebin)()(64bit) libgsttranscode.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttranscoder-1.0.so.0()(64bit)"

inherit rpm
