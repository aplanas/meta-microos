SUMMARY = "Convenience package for a single-instance setup"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-single-instance-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "af3af681750f97e82af0bb10b91accd738d2509b5f79fdc0ec0fabf43d44c68698e45732281ec5c1757c6c125f9298b0dcfc0f0313744fbf6db350ae3e8f628a"

RPROVIDES:${PN} += "openQA-single-instance openQA-single-instance(aarch-64)"
RDEPENDS:${PN} += "apache2 openQA openQA-local-db openQA-worker"

inherit rpm
