SUMMARY = "Find outdated or deprecated Helm charts running in your cluster"
DESCRIPTION = "Nova scans your cluster for installed Helm charts, then cross-checks them against all known Helm repositories. If it finds an updated version of the chart you're using, or notices your current version is deprecated, it will let you know."
LICENSE = "Apache-2.0"

PV = "3.6.2"

RPM_NAME = "nova-3.6.2-2.1.aarch64.rpm"
RPM_HASH = "80c5a9d6c38fec75f6f06137bef5cda13a8de0395ccc572d54ba0838fe882ff796fde9297f5f2c8dbfefb34b7e67b8aeb45f2f2b9d7f59180bfde0f5920f68df"

RPROVIDES:${PN} += "nova nova(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
