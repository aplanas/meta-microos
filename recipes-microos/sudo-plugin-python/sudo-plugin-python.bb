SUMMARY = "Plugin API for python"
DESCRIPTION = "This package contains the sudo plugin which allows to write sudo plugins \
in python. The API closely follows the C sudo plugin API described by \
sudo_plugin(5)."
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-plugin-python-1.9.13p3-3.1.aarch64.rpm"
RPM_HASH = "8b395dda968182335d43a306b5e5a9ad578b96dd433c4f27bf6cdc43e4bdd577328298842e0b5bdbc5604ffe18d9fe0fee574693fe27c56b280e3aded3e633f5"

RPROVIDES:${PN} += "sudo-plugin-python sudo-plugin-python(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) libsudo_util.so.0()(64bit) sudo"

inherit rpm
