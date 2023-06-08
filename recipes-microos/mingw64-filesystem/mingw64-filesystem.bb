SUMMARY = "MinGW base filesystem and environment"
DESCRIPTION = "This package contains the base filesystem layout, RPM macros and \
environment for all MinGW packages. \
 \
This environment is maintained by the Fedora MinGW SIG at: \
 \
  http://fedoraproject.org/wiki/SIGs/MinGW"
LICENSE = "GPL-2.0-or-later"

PV = "20230401"

RPM_NAME = "mingw64-filesystem-20230401-1.1.noarch.rpm"
RPM_HASH = "3727b8e1374a858dd681e10e8eff751bd584f8dffcd3c52d82558787414dc42db5a856b623c896ffd02e7bf0be5a9128dd883efd283dd37c35c91a0fc5a89e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(bcrypt.dll) mingw64(d2d1.dll) mingw64(d3d11.dll) mingw64(d3d12.dll) mingw64(dbghelp.dll) mingw64(dcomp.dll) mingw64(dwrite.dll) mingw64(dxgi.dll) mingw64(mpr.dll) mingw64(ncrypt.dll) mingw64(odbccp32.dll) mingw64(userenv.dll) mingw64(uxtheme.dll) mingw64(wtsapi32.dll) mingw64-filesystem rpm_macro(_mingw64_addr2line) rpm_macro(_mingw64_ar) rpm_macro(_mingw64_as) rpm_macro(_mingw64_bindir) rpm_macro(_mingw64_cache) rpm_macro(_mingw64_cc) rpm_macro(_mingw64_cflags) rpm_macro(_mingw64_classpath) rpm_macro(_mingw64_configure) rpm_macro(_mingw64_cpp) rpm_macro(_mingw64_cpu) rpm_macro(_mingw64_create_macro_links) rpm_macro(_mingw64_cxx) rpm_macro(_mingw64_cxxflags) rpm_macro(_mingw64_datadir) rpm_macro(_mingw64_debug_install_post) rpm_macro(_mingw64_debug_package) rpm_macro(_mingw64_dlltool) rpm_macro(_mingw64_dllwrap) rpm_macro(_mingw64_docdir) rpm_macro(_mingw64_env) rpm_macro(_mingw64_exec_prefix) rpm_macro(_mingw64_fc) rpm_macro(_mingw64_find_lang) rpm_macro(_mingw64_gcj) rpm_macro(_mingw64_gcov) rpm_macro(_mingw64_gdb) rpm_macro(_mingw64_gprof) rpm_macro(_mingw64_host) rpm_macro(_mingw64_includedir) rpm_macro(_mingw64_infodir) rpm_macro(_mingw64_install_post) rpm_macro(_mingw64_ld) rpm_macro(_mingw64_ldflags) rpm_macro(_mingw64_ldflags_base) rpm_macro(_mingw64_ldflags_bootstrap) rpm_macro(_mingw64_libdir) rpm_macro(_mingw64_libexecdir) rpm_macro(_mingw64_localstatedir) rpm_macro(_mingw64_make) rpm_macro(_mingw64_make_install) rpm_macro(_mingw64_makeinstall) rpm_macro(_mingw64_mandir) rpm_macro(_mingw64_nm) rpm_macro(_mingw64_objcopy) rpm_macro(_mingw64_objdump) rpm_macro(_mingw64_os) rpm_macro(_mingw64_package_header) rpm_macro(_mingw64_package_header_debug) rpm_macro(_mingw64_prefix) rpm_macro(_mingw64_ranlib) rpm_macro(_mingw64_readelf) rpm_macro(_mingw64_sbindir) rpm_macro(_mingw64_sharedstatedir) rpm_macro(_mingw64_size) rpm_macro(_mingw64_strings) rpm_macro(_mingw64_strip) rpm_macro(_mingw64_sysconfdir) rpm_macro(_mingw64_sysroot) rpm_macro(_mingw64_target) rpm_macro(_mingw64_vendor) rpm_macro(_mingw64_windmc) rpm_macro(_mingw64_windres)"
RDEPENDS:${PN} += "/bin/bash /bin/sh coreutils findutils gawk grep mingw64-cross-binutils-utils mingw64-cross-pkgconf-utils python3 rpm rpmlint-mini sed"

inherit rpm
