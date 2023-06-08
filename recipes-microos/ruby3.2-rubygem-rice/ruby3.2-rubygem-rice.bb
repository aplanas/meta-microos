SUMMARY = "Ruby Interface for C++ Extensions"
DESCRIPTION = "Rice is a C++ interface to Ruby's C API. It provides a type-safe and \
exception-safe interface in order to make embedding Ruby and writing \
Ruby extensions with C++ easier."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "ruby3.2-rubygem-rice-4.0.4-1.5.aarch64.rpm"
RPM_HASH = "f493dcdcf78ebbf9fe0e60f4be5ce9babc06ce81fc2051f8b7f05b5aa667e47478744155774d4898d91480fdf3d56c6eb526a27fb91ad0aee7366a1feb15e682"

RPROVIDES:${PN} += "ruby3.2-rubygem-rice ruby3.2-rubygem-rice(aarch-64) rubygem(rice) rubygem(ruby:3.2.0:rice) rubygem(ruby:3.2.0:rice:4) rubygem(ruby:3.2.0:rice:4.0) rubygem(ruby:3.2.0:rice:4.0.4)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
