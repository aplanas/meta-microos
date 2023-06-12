SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "liblcms2-devel-2.15-1.1.aarch64.rpm"
RPM_HASH = "f88620ee62c39d368639aafe7838844bd79f58c1c79d5a4265cdd4373ff53e7d9bbab96e0ebba9b90d4ef8141d0622bda88c931de0c7b2397d5151e8522885fa"

RPROVIDES:${PN} += "liblcms2-devel \
liblcms2-devel(aarch-64) \
pkgconfig(lcms2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liblcms2-2"

inherit rpm
