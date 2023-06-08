SUMMARY = "Open Object Rexx"
DESCRIPTION = " \
Open Object Rexx is an object-oriented scripting language. The language \
is designed for both beginners and experienced Rexx programmers. It is \
easy to learn and use, and provides an excellent vehicle to enter the \
world of object-oriented programming without much effort. \
 \
It extends the procedural way of Rexx programming with object-oriented \
features that allow you to gradually change your programming style as \
you learn more about objects. \
 \
For more information on ooRexx, visit http://www.oorexx.org/ \
For more information on Rexx, visit http://www.rexxla.org/"
LICENSE = "CPL-1.0"

PV = "4.2.0"

RPM_NAME = "ooRexx-4.2.0-18.12.aarch64.rpm"
RPM_HASH = "da38fc896da12e059a7e2ed7d70a82dfb442a87da3f6b77820176c729736d25924e053fd48fdb7c925d2c1bd38f98884975c83580ba930443aa3bfb3e3963b7c"

RPROVIDES:${PN} += "libhostemu.so.4()(64bit) librexx.so.4()(64bit) librexxapi.so.4()(64bit) librexxutil.so.4()(64bit) librxmath.so.4()(64bit) librxregexp.so.4()(64bit) librxsock.so.4()(64bit) librxunixsys.so.4()(64bit) ooRexx ooRexx(aarch-64) rpm_macro(_ooRexx) rpm_macro(_rexxclassdir) rpm_macro(_rexxlibdir)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/update-alternatives systemd"

inherit rpm
