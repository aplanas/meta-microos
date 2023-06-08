SUMMARY = "Tools for Subversion"
DESCRIPTION = "This package contains some tools for subversion server and \
repository admins."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-tools-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "8f844e418f845677be0ef2109bac9078b8e08ac335426e2fbe6bef637ca34b2b0ae91da76e8b39df1923980f8b2475668b94f290d527157a94772ab758ff7825"

RPROVIDES:${PN} += "subversion-tools subversion-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapr-1.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libsvn_client-1.so.0()(64bit) libsvn_delta-1.so.0()(64bit) libsvn_fs-1.so.0()(64bit) libsvn_ra-1.so.0()(64bit) libsvn_repos-1.so.0()(64bit) libsvn_subr-1.so.0()(64bit) libsvn_wc-1.so.0()(64bit)"

inherit rpm
