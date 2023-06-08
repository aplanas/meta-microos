SUMMARY = "Utilities to inspect Common Log File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsclfs, which allows for \
reading Common Log File Systems (CLFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs-tools-20210417-3.3.aarch64.rpm"
RPM_HASH = "9f93a3331e12227d755c8357fb442a07c1b243faca053146231b4af74f2df5b95110c549ad43279246831f5c458a82d2fdcf958d240393a95cc2a73d8500daca"

RPROVIDES:${PN} += "libfsclfs-tools libfsclfs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfsclfs.so.1()(64bit) libfsclfs.so.1(V_20210417)(64bit) libftxf.so.1()(64bit) libftxf.so.1(V_20220116)(64bit) libftxr.so.1()(64bit) libftxr.so.1(V_20220118)(64bit)"

inherit rpm
