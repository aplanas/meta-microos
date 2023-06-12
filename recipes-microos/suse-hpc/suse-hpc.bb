SUMMARY = "SUSE HPC Environment"
DESCRIPTION = "Provide rpm macros for building and installing SUSE HPC \
packages."
LICENSE = "BSD-3-Clause"

PV = "0.5.20230501.968c9cb"

RPM_NAME = "suse-hpc-0.5.20230501.968c9cb-1.1.aarch64.rpm"
RPM_HASH = "00cac8aeb5d4a83b529e151c0e8357bc6bcc4ef43cb88907645811f8db9066b20f14e3bd748df18c42f39cd5cf1da2d467fc24f30eb5fcdb8a8b41b08bc89022"

RPROVIDES:${PN} += "rpm_macro(_hpc_init) \
rpm_macro(_hpc_module_base) \
rpm_macro(_hpc_p) \
rpm_macro(_hpc_python_sysconfig_path) \
rpm_macro(_hpc_python_ver) \
rpm_macro(_hpc_write_pkgconfig) \
rpm_macro(hpc_PNAME) \
rpm_macro(hpc_base) \
rpm_macro(hpc_base_dirs) \
rpm_macro(hpc_bindir) \
rpm_macro(hpc_cf_dirs) \
rpm_macro(hpc_cf_install_base) \
rpm_macro(hpc_cf_install_path) \
rpm_macro(hpc_cf_install_path_base) \
rpm_macro(hpc_cf_requires) \
rpm_macro(hpc_cf_requires_devel) \
rpm_macro(hpc_cmake) \
rpm_macro(hpc_cmake_dir) \
rpm_macro(hpc_cmake_moddir) \
rpm_macro(hpc_compiler_family_path) \
rpm_macro(hpc_compress_man) \
rpm_macro(hpc_configure) \
rpm_macro(hpc_datadir) \
rpm_macro(hpc_debug) \
rpm_macro(hpc_dirs) \
rpm_macro(hpc_docdir) \
rpm_macro(hpc_exec_prefix) \
rpm_macro(hpc_includedir) \
rpm_macro(hpc_infodir) \
rpm_macro(hpc_init) \
rpm_macro(hpc_install_base) \
rpm_macro(hpc_install_path) \
rpm_macro(hpc_install_path_base) \
rpm_macro(hpc_libdir) \
rpm_macro(hpc_libexecdir) \
rpm_macro(hpc_localstatedir) \
rpm_macro(hpc_make_modules_dir) \
rpm_macro(hpc_make_modules_extra_python) \
rpm_macro(hpc_mandir) \
rpm_macro(hpc_master_package) \
rpm_macro(hpc_meson) \
rpm_macro(hpc_module_delete_if_default) \
rpm_macro(hpc_module_dep_base) \
rpm_macro(hpc_module_dep_install) \
rpm_macro(hpc_module_dep_path) \
rpm_macro(hpc_module_extra_python) \
rpm_macro(hpc_module_pname) \
rpm_macro(hpc_modulefile_add_pkgconfig_path) \
rpm_macro(hpc_modulepath) \
rpm_macro(hpc_modules_files) \
rpm_macro(hpc_modules_init) \
rpm_macro(hpc_mpi_dirs) \
rpm_macro(hpc_mpi_family_path) \
rpm_macro(hpc_mpi_install_base) \
rpm_macro(hpc_mpi_install_path) \
rpm_macro(hpc_mpi_install_path_base) \
rpm_macro(hpc_mpi_requires) \
rpm_macro(hpc_mpi_requires_devel) \
rpm_macro(hpc_package_name) \
rpm_macro(hpc_package_name_tail) \
rpm_macro(hpc_pkgconfig_file) \
rpm_macro(hpc_pkgconfigdir) \
rpm_macro(hpc_python_master_package) \
rpm_macro(hpc_python_mv_to_sitearch) \
rpm_macro(hpc_python_sitearch) \
rpm_macro(hpc_python_sitearch_no_singlespec) \
rpm_macro(hpc_python_sitelib) \
rpm_macro(hpc_python_sitelib_no_singlespec) \
rpm_macro(hpc_python_version) \
rpm_macro(hpc_requires) \
rpm_macro(hpc_requires_devel) \
rpm_macro(hpc_sbindir) \
rpm_macro(hpc_setup) \
rpm_macro(hpc_setup_compiler) \
rpm_macro(hpc_setup_mpi) \
rpm_macro(hpc_sharedstatedir) \
rpm_macro(hpc_shebang_prepend_list) \
rpm_macro(hpc_shebang_remove) \
rpm_macro(hpc_shebang_sanitize_scripts) \
rpm_macro(hpc_sysconfdir) \
rpm_macro(hpc_upcase) \
rpm_macro(hpc_verify_python3) \
rpm_macro(hpc_write_modules_files) \
rpm_macro(hpc_write_modules_version_file) \
rpm_macro(hpc_write_pkgconfig) \
suse-hpc \
suse-hpc(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
