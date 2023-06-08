SUMMARY = "Tool for extracting metrics from application logs"
DESCRIPTION = "mtail is a tool for extracting metrics from application logs to be exported \
into a timeseries database or timeseries calculator for alerting and \
dashboarding."
LICENSE = "Apache-2.0"

PV = "3.0.0rc51"

RPM_NAME = "mtail-3.0.0rc51-1.3.aarch64.rpm"
RPM_HASH = "95c21f9665f01037f38d8c52730237ec0f881d658fdc506f4e76dc3f838d5231d3360ce42e604eb777f2b73a9a707727c3c6e15399666caafa8f20f708b5afa2"

RPROVIDES:${PN} += "config(mtail) mtail mtail(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit) shadow"

inherit rpm
