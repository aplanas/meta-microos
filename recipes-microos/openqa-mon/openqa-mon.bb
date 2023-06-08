SUMMARY = "CLI monitoring utility for openQA"
DESCRIPTION = "openqa-mon is a CLI monitoring client for openqa written in plain go."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "openqa-mon-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "ee492ded8d49bad86f36f4da37730aa5a665666ab906459413c32f528a03031b7f54e175f2f4a3fb7663ba6c2144b06453d7257080e59bbae7642f2f1049e437"

RPROVIDES:${PN} += "openqa-mon openqa-mon(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
