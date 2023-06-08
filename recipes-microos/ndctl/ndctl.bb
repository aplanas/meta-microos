SUMMARY = "Manage 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, used for \
platform NVDIMM resources like those defined by the ACPI 6.0 NFIT \
(NVDIMM Firmware Interface Table)."
LICENSE = "GPL-2.0-only"

PV = "76"

RPM_NAME = "ndctl-76-1.3.aarch64.rpm"
RPM_HASH = "daa3c07ec2eace60072a4a1b0bcf5c087bb6cfa78e93314b3c7f0aae6ee411bbc3666ff014775a66a7218e7ed43690887bc52e366bd0a59ef683cbd3719f2902"

RPROVIDES:${PN} += "config(ndctl) ndctl ndctl(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcxl.so.1()(64bit) libcxl.so.1(LIBCXL_1)(64bit) libcxl.so.1(LIBCXL_2)(64bit) libcxl.so.1(LIBCXL_3)(64bit) libcxl.so.1(LIBCXL_4)(64bit) libdaxctl.so.1()(64bit) libdaxctl.so.1(LIBDAXCTL_1)(64bit) libdaxctl.so.1(LIBDAXCTL_2)(64bit) libdaxctl.so.1(LIBDAXCTL_3)(64bit) libdaxctl.so.1(LIBDAXCTL_4)(64bit) libdaxctl.so.1(LIBDAXCTL_5)(64bit) libdaxctl.so.1(LIBDAXCTL_6)(64bit) libdaxctl.so.1(LIBDAXCTL_7)(64bit) libdaxctl.so.1(LIBDAXCTL_8)(64bit) libdaxctl.so.1(LIBDAXCTL_9)(64bit) libiniparser.so.1()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libjson-c.so.5(JSONC_PRIVATE)(64bit) libkeyutils.so.1()(64bit) libkeyutils.so.1(KEYUTILS_0.3)(64bit) libndctl.so.6()(64bit) libndctl.so.6(LIBNDCTL_1)(64bit) libndctl.so.6(LIBNDCTL_13)(64bit) libndctl.so.6(LIBNDCTL_14)(64bit) libndctl.so.6(LIBNDCTL_15)(64bit) libndctl.so.6(LIBNDCTL_16)(64bit) libndctl.so.6(LIBNDCTL_17)(64bit) libndctl.so.6(LIBNDCTL_18)(64bit) libndctl.so.6(LIBNDCTL_19)(64bit) libndctl.so.6(LIBNDCTL_20)(64bit) libndctl.so.6(LIBNDCTL_21)(64bit) libndctl.so.6(LIBNDCTL_22)(64bit) libndctl.so.6(LIBNDCTL_23)(64bit) libndctl.so.6(LIBNDCTL_24)(64bit) libndctl.so.6(LIBNDCTL_25)(64bit) libndctl.so.6(LIBNDCTL_26)(64bit) libndctl.so.6(LIBNDCTL_27)(64bit) libndctl.so.6(LIBNDCTL_28)(64bit) libndctl.so.6(LIBNDCTL_3)(64bit) libtraceevent.so.1()(64bit) libtracefs.so.1()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) systemd"

inherit rpm
