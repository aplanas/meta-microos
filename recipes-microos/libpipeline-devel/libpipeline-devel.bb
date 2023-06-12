SUMMARY = "A pipeline manipulation library"
DESCRIPTION = "libpipeline is a C library for setting up and running pipelines of \
processes, without needing to involve shell command-line parsing which \
is often error-prone and insecure. This alleviates programmers of the \
need to laboriously construct pipelines using lower-level primitives \
such as fork(2) and execve(2)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.7"

RPM_NAME = "libpipeline-devel-1.5.7-1.2.aarch64.rpm"
RPM_HASH = "162b93624782dea63e94d7c6619f6dc4f3e54a090a4ef20e6b4522de283b69cfa0f3b358ec801e4f0ff41cd38f0c01e183269f098995ebd339326c9331fab87d"

RPROVIDES:${PN} += "libpipeline-devel \
libpipeline-devel(aarch-64) \
pkgconfig(libpipeline)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipeline1"

inherit rpm
