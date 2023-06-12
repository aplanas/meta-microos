SUMMARY = "Build APKs from source code"
DESCRIPTION = "Build apk packages using declarative pipelines. \
 \
Commonly used to provide custom packages for container images built with apko. The majority of apks are built for use with either the Wolfi or Alpine Linux ecosystems. \
 \
Key features: \
 \
* Pipeline-oriented builds. Every step of the build pipeline is defined and controlled by you, unlike traditional package managers which have distinct phases. \
* Multi-architecture by default. QEMU is used to emulate various architectures, avoiding the need for cross-compilation steps."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-0.3.2-1.2.aarch64.rpm"
RPM_HASH = "e38b2e4f654abea85e3ecf0d479553be30f3e4d08a7b6d3166d976f3ed2443f8ab566b20bc18e5c6cec48a85b8ea366cc061999bd895dc128a37fde8a4394ed5"

RPROVIDES:${PN} += "melange melange(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
