SUMMARY = "Binary files of aleph"
DESCRIPTION = "Binary files of aleph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-aleph-bin-2023.20230311.svn66084-89.1.aarch64.rpm"
RPM_HASH = "a3bfa0957f5cb2461f29c2220f25d77ecc0d0ef200a8199363f836dd0d0b1fc808033c9fd3b7b9aab1491344412ed1102dba8cda9a1a2ff1d796fbc5c36e0dae"

RPROVIDES:${PN} += "texlive-aleph-bin texlive-aleph-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-aleph"

inherit rpm
