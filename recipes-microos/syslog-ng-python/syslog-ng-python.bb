SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-python-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "5c6106f6dd79dbfd09784ebbd6ea9c173d3366bf3bb057263e12d4bfb7d4b210c9ae353bf890c198ab30219976442a69a972e01b52ba6df64050e5ecae8af265"

RPROVIDES:${PN} += "libmod-python.so()(64bit) syslog-ng-python syslog-ng-python(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) libsyslog-ng-4.0.so.0()(64bit) python3-PyYAML python3-cachetools python3-certifi python3-charset-normalizer python3-google-auth python3-idna python3-kubernetes python3-pip python3-pyasn1 python3-pyasn1-modules python3-python-dateutil python3-requests python3-rsa python3-six python3-websocket-client syslog-ng"

inherit rpm
