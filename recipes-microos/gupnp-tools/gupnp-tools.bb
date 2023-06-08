SUMMARY = "UPnP tools to test and debug UPnP devices and control points"
DESCRIPTION = "GUPnP Tools are free replacements of Intel UPnP tools that use GUPnP. \
They provides the following client and server side tools which enable \
one to easily test and debug one's UPnP devices and control points: \
 \
  * Universal Control Point: a tool that enables one to discover UPnP \
    devices and services, retrieve information about them, subscribe to events \
    and invoke actions. \
 \
  * Network Light: a virtual light bulb that allows control points to \
    switch it on and off, change its dimming level and query its current \
    status. It also provides a simple UI to control all the network lights \
    available on the network. \
 \
  * AV Control Point: a simple media player UI that enables one to \
    discover and play multimedia contents available on a network. It is \
    strictly a control point and therefore does not have any playback \
    capabilities of it's own and relies on external UPnP MediaRenderer devices \
    for actual playback. \
 \
  * Upload: a simple commandline utility that uploads files to known \
    MediaServers. Use Universal Control Point for discovering the \
    MediaServers."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-tools-0.12.0-1.3.aarch64.rpm"
RPM_HASH = "050e573e9907d758f6a8629d1591e99561aef3fe5062411b1b4f550137210e58778ceb8cc0058d4f6e2f163fd08f5c56410e7c884842c13809af55420e8b9258"

RPROVIDES:${PN} += "application() application(gupnp-av-cp.desktop) application(gupnp-network-light.desktop) application(gupnp-universal-cp.desktop) gupnp-tools gupnp-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgssdp-1.6.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libgupnp-1.6.so.0()(64bit) libgupnp-av-1.0.so.3()(64bit) libsoup-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
