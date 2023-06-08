SUMMARY = "Python language and compatibility facilities"
DESCRIPTION = "twitter.commonn.lang is a Python library for language and compatibility \
facilities. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python39-twitter.common.lang-0.3.11-1.15.aarch64.rpm"
RPM_HASH = "c343031e9f74962c439667f9634b7db11882bb104f15a402747df37a97dda1f7282376090a4d98362552438d6438071fb7e08988c4c11f1cfd4f7259b1ba6130"

RPROVIDES:${PN} += "python3.9dist(twitter.common.lang) python39-twitter.common.lang python39-twitter.common.lang(aarch-64) python3dist(twitter.common.lang)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
