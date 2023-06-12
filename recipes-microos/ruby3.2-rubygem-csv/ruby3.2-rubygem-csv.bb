SUMMARY = "CSV Reading and Writing"
DESCRIPTION = "The CSV library provides a complete interface to CSV files and data. It offers \
tools to enable you to read and write to and from Strings or IO objects, as \
needed."
LICENSE = "BSD-2-Clause & Ruby"

PV = "3.2.5"

RPM_NAME = "ruby3.2-rubygem-csv-3.2.5-1.5.aarch64.rpm"
RPM_HASH = "6d28190dd580f59ab579d93935f7579fd45aa020df0b0a2d7c4fa5c23e687922400479ba4508bab8f6a49185e6768f90336e3a6f882a45071bfbf7b7630d6f8c"

RPROVIDES:${PN} += "ruby3.2-rubygem-csv \
ruby3.2-rubygem-csv(aarch-64) \
rubygem(csv) \
rubygem(ruby:3.2.0:csv) \
rubygem(ruby:3.2.0:csv:3) \
rubygem(ruby:3.2.0:csv:3.2) \
rubygem(ruby:3.2.0:csv:3.2.5)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
