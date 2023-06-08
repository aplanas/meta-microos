SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "gstreamer-plugin-pipewire-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "6df4fa9050b07c3655e08feaf74701c076e411c198b085a8b58e0041ebf5a999fbd03613ee7d04dc7a8e633151f84d3250af9abd5c8c1eb76f6b9de5c953f739"

RPROVIDES:${PN} += "gstreamer-plugin-pipewire gstreamer-plugin-pipewire(aarch-64) gstreamer1(element-pipewiresink)()(64bit) gstreamer1(element-pipewiresrc)()(64bit) libgstpipewire.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libpipewire-0.3.so.0()(64bit)"

inherit rpm
