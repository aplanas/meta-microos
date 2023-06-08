SUMMARY = "Scanner, lexer, parser for ruby's regular expressions"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "ruby3.2-rubygem-regexp_parser-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "da2d91a0ec1f8fe5396aa5c2b1857d246638874d63304e7a0c0dc8f810156187e1943d6f23aced663613b99fc0547dc4315d18dae3cc67bdb467c526c7f58941"

RPROVIDES:${PN} += "ruby3.2-rubygem-regexp_parser ruby3.2-rubygem-regexp_parser(aarch-64) rubygem(regexp_parser) rubygem(ruby:3.2.0:regexp_parser) rubygem(ruby:3.2.0:regexp_parser:2) rubygem(ruby:3.2.0:regexp_parser:2.6) rubygem(ruby:3.2.0:regexp_parser:2.6.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
