SUMMARY = "Weather Condition Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Weather plugin shows short- and long-term weather forecasts."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.1"

RPM_NAME = "xfce4-weather-plugin-0.11.1-1.1.aarch64.rpm"
RPM_HASH = "8c1673e1d27198ecb5c2018080df3ca84a69c81e976df3076c2d6fa84f94c198c382aeb8698191f562e7a4cb78479335fdd24985464dcaa590409febc514f716"

RPROVIDES:${PN} += "libweather.so()(64bit) xfce4-panel-plugin-weather xfce4-weather-plugin xfce4-weather-plugin(aarch-64)"
RDEPENDS:${PN} += "exo-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libsoup-2.4.so.1()(64bit) libupower-glib.so.3()(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) xfce4-panel"

inherit rpm
