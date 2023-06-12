SUMMARY = "Email composition and delivery framework (part of Rails)"
DESCRIPTION = "Email on Rails. Compose, deliver, and test emails using the familiar \
controller/view pattern. First-class support for multipart email and \
attachments."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-actionmailer-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "29e1c534017c39a8e92a08eee287cd976388115abb5a10dbfeefe23027d67a5976036b61253f26fb0ac8c0687d40c5ace3d0dddfdbe82a672641cf7666be9258"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionmailer-7.0 \
ruby3.2-rubygem-actionmailer-7.0(aarch-64) \
rubygem(actionmailer) \
rubygem(ruby:3.2.0:actionmailer) \
rubygem(ruby:3.2.0:actionmailer:7) \
rubygem(ruby:3.2.0:actionmailer:7.0) \
rubygem(ruby:3.2.0:actionmailer:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:actionview) \
rubygem(ruby:3.2.0:activejob) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:mail) \
rubygem(ruby:3.2.0:mail:2) \
rubygem(ruby:3.2.0:net-imap) \
rubygem(ruby:3.2.0:net-pop) \
rubygem(ruby:3.2.0:net-smtp) \
rubygem(ruby:3.2.0:rails-dom-testing:2)"

inherit rpm
