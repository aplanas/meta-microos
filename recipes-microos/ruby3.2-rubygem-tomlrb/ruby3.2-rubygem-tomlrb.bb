SUMMARY = "A racc based toml parser"
DESCRIPTION = "A racc based toml parser."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "ruby3.2-rubygem-tomlrb-2.0.3-1.5.aarch64.rpm"
RPM_HASH = "797c055afbe0f5b85d2c701be47c99836bd5dc4932f3a689cb723be431c702b7ad08a1a2bce71f1c19b52eee6950ecb92fa0a336ea05cfcbc4d13989cb55efc9"

RPROVIDES:${PN} += "ruby3.2-rubygem-tomlrb ruby3.2-rubygem-tomlrb(aarch-64) rubygem(ruby:3.2.0:tomlrb) rubygem(ruby:3.2.0:tomlrb:2) rubygem(ruby:3.2.0:tomlrb:2.0) rubygem(ruby:3.2.0:tomlrb:2.0.3) rubygem(tomlrb)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
