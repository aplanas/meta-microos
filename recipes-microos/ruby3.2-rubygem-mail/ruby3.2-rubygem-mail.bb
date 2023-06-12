SUMMARY = "Mail provides a nice Ruby DSL for making, sending and reading emails"
DESCRIPTION = "A really Ruby Mail handler."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "ruby3.2-rubygem-mail-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "631be95220b9ad033b8b58767cc996fa5ce7cc7a9c72644bddc9c560080fa1879d16868f5804ffd7dfad5c8581cc04129f93d19251d61b1996ad77e48ace12ab"

RPROVIDES:${PN} += "ruby3.2-rubygem-mail \
ruby3.2-rubygem-mail(aarch-64) \
rubygem(mail) \
rubygem(ruby:3.2.0:mail) \
rubygem(ruby:3.2.0:mail:2) \
rubygem(ruby:3.2.0:mail:2.8) \
rubygem(ruby:3.2.0:mail:2.8.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:mini_mime) \
rubygem(ruby:3.2.0:net-imap) \
rubygem(ruby:3.2.0:net-pop) \
rubygem(ruby:3.2.0:net-smtp)"

inherit rpm
