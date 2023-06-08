SUMMARY = "Turbolinks makes navigating your web application faster"
DESCRIPTION = "Rails engine for Turbolinks 5 support."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ruby3.2-rubygem-turbolinks-5.2.1-1.17.aarch64.rpm"
RPM_HASH = "e9edb4ba0c6324a66cdfaaae5775594df71e10fef28d001f9d79c318cae986a9ab8c215aaa0f45f623f9e4877df65cdea0081132d559b64dcbe456c84f7ac289"

RPROVIDES:${PN} += "ruby3.2-rubygem-turbolinks ruby3.2-rubygem-turbolinks(aarch-64) rubygem(ruby:3.2.0:turbolinks) rubygem(ruby:3.2.0:turbolinks:5) rubygem(ruby:3.2.0:turbolinks:5.2) rubygem(ruby:3.2.0:turbolinks:5.2.1) rubygem(turbolinks)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:turbolinks-source:5)"

inherit rpm
