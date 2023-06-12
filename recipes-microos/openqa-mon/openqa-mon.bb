SUMMARY = "CLI monitoring utility for openQA"
DESCRIPTION = "openqa-mon is a CLI monitoring client for openqa written in plain go."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "openqa-mon-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "261fd71952ef02fdaa2e9cdd575e7fe103316666656897c5fc094d09a9fbc62defe6425950d1b7c26c29c08e8b9a1aae9e2649c6f907c862bdb2ba557da7f84d"

RPROVIDES:${PN} += "openqa-mon openqa-mon(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
