SUMMARY = "SLURM plugins (loadable shared objects)"
DESCRIPTION = "This package contains the SLURM plugins (loadable shared objects)"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugins-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "11bd78f9f15c6f316c98e8e00384347434a02013f7fdc613e8af78a5ab5f33c095f5b63397d594b72d06733e40baad14eb16dba9b992ab1c5efb9fd2831d54e6"

RPROVIDES:${PN} += "config(slurm-plugins) libslurm_pmi.so()(64bit) libslurmfull.so()(64bit) slurm-plugins slurm-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libhwloc.so.15()(64bit) libibmad.so.5()(64bit) libibmad.so.5(IBMAD_1.3)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpmix2 libresolv.so.2()(64bit) libresolv.so.2(GLIBC_2.17)(64bit) libyaml-0.so.2()(64bit) pmix"

inherit rpm
