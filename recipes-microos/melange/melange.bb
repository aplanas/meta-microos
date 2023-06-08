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

RPM_NAME = "melange-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "e304bd7ea8828826a1bcaa36dcb1a8df73ae45d06276e541c1bd7c5607ac87147de5104eb37471bae4dd776d25fc143f5602b68b25cc225de761ee0a8d8a74c2"

RPROVIDES:${PN} += "melange melange(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
