SUMMARY = "Dynamically create Perl language bindings"
DESCRIPTION = "Dynamically create Perl language bindings"
LICENSE = "LGPL-2.1-only"

PV = "0.050"

RPM_NAME = "perl-Glib-Object-Introspection-0.050-1.1.aarch64.rpm"
RPM_HASH = "4c00ed8d2203c67e2067b3a9c7a08de45fdee43861dc58aa0455ae8b0033201e6b9e7de7acc4130e8eb9d19ecf055d9fcd75ae012c0d668c53e94dc7a7511562"

RPROVIDES:${PN} += "perl(Glib::Object::Introspection) \
perl(Glib::Object::Introspection::Install::Files) \
perl(Glib::Object::Introspection::_FuncWrapper) \
perl-Glib-Object-Introspection \
perl-Glib-Object-Introspection(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(ExtUtils::Depends) \
perl(ExtUtils::PkgConfig) \
perl(Glib)"

inherit rpm
