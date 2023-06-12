SUMMARY = "An MS Windows Emulator"
DESCRIPTION = "Wine is a compatibility layer capable of running Windows \
applications. Instead of simulating internal Windows logic like a \
virtual machine or emulator, Wine translates Windows API calls into \
POSIX calls on-the-fly, eliminating the performance and memory \
penalties of other methods and allowing you to cleanly integrate \
Windows applications into your desktop. \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
You can run your Windows executables with it and write your Windows \
programs under Linux and link against the WINE libraries. It is not \
necessary to have a Windows installation to run WINE. \
 \
Refer to /usr/share/doc/packages/wine/README.SUSE. There is more \
documentation available in that directory. Read 'man wine' for further \
information. \
 \
You can invoke wine by entering 'wine program.exe'. Configure it by \
running 'winecfg'."
LICENSE = "LGPL-2.1-or-later"

PV = "8.8"

RPM_NAME = "wine-8.8-1.2.aarch64.rpm"
RPM_HASH = "724198020c00279a82094848f6ed5c852fc9d389c8fc46b6ec10dae9d94a38e7ebfe4437dfe4b2c8ce4541528b36a730c533fd7ce1c1dd9260d6c3e432783ba7"

RPROVIDES:${PN} += "application() application(wine-browsedrive.desktop) application(wine-msi.desktop) application(wine-notepad.desktop) application(wine-regedit.desktop) application(wine-uninstaller.desktop) application(wine-winecfg.desktop) application(wine-winefile.desktop) application(wine-winehelp.desktop) application(wine-winemine.desktop) application(wine.desktop) bundled(FAudio) bundled(jpeg) bundled(libgsm) bundled(libjxr) bundled(liblcms2) bundled(libpng) bundled(libxml2) bundled(libxslt) bundled(mpg123) bundled(openldap2) bundled(tiff) bundled(vkd3d) bundled(zlib) config(wine) mimehandler(application/x-ms-dos-executable) mimehandler(application/x-ms-shortcut) mimehandler(application/x-msdos-program) mimehandler(application/x-msi) mimehandler(application/x-win-lnk) wine wine(aarch-64) wine-mp3"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libOSMesa.so.8()(64bit) libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libOpenCL.so.1(OPENCL_1.1)(64bit) libOpenCL.so.1(OPENCL_1.2)(64bit) libSDL2-2.0.so.0()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libXxf86vm.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.35)(64bit) libcapi20.so.3()(64bit) libcups.so.2()(64bit) libdbus-1.so.3()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgobject-2.0.so.0()(64bit) libgphoto2.so.6()(64bit) libgphoto2_port.so.12()(64bit) libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) libgssapi_krb5.so.2()(64bit) libgstaudio-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libkrb5.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcap.so.1()(64bit) libpcsclite.so.1()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsane.so.1()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libunwind.so.8()(64bit) libusb-1.0.so.0()(64bit) libv4l2.so.0()(64bit) libvulkan.so.1()(64bit) libvulkan_intel libvulkan_radeon libwayland-client.so.0()(64bit) samba-winbind"

inherit rpm
