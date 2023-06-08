SUMMARY = "Translates Ruby Hashes to XML"
DESCRIPTION = "Gyoku translates Ruby Hashes to XML."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby3.2-rubygem-gyoku-1.4.0-1.8.aarch64.rpm"
RPM_HASH = "50c2570efcd7d44fb15cd2a6b70df7c96fd9bec754d7de8ae309aceb4d32a9e578991c126a6ac3808dafdd091b67f735cc4c67cf5cfd8b9949027727b5cee9a9"

RPROVIDES:${PN} += "ruby3.2-rubygem-gyoku ruby3.2-rubygem-gyoku(aarch-64) rubygem(gyoku) rubygem(ruby:3.2.0:gyoku) rubygem(ruby:3.2.0:gyoku:1) rubygem(ruby:3.2.0:gyoku:1.4) rubygem(ruby:3.2.0:gyoku:1.4.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:builder) rubygem(ruby:3.2.0:rexml:3)"

inherit rpm
