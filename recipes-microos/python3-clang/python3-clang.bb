SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "python3-clang-16.0.2-1.1.noarch.rpm"
RPM_HASH = "5a1ed8e44c308283eea313f36eece3a8beb40037d20ea486f646009341a48cbf87925844079ea0efda1889583d78e49ff78bfe75676f16c217f3fb4ce5459f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clang"
RDEPENDS:${PN} += "python3-clang16"

inherit rpm
