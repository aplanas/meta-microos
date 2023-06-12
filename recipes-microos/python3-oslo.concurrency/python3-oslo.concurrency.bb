SUMMARY = "OpenStack oslo.concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python3-oslo.concurrency-5.0.1-1.2.noarch.rpm"
RPM_HASH = "44fa22848df432d5bb62d8c682a5f8a70203cdbc0a40314fb6d18113288e69bf7630eeef5e4f5485f06b58b37fb801b62b1adc1fc9be9ec43c6b94b91104dbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.concurrency \
python3.10dist(oslo.concurrency) \
python3dist(oslo.concurrency)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-fasteners \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.utils"

inherit rpm
