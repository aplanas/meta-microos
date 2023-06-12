SUMMARY = "Test JSON data"
DESCRIPTION = "JavaScript Object Notation (JSON) is a lightweight data interchange format. \
the Test::JSON manpage makes it easy to verify that you have built valid \
JSON and that it matches your expected output. \
 \
See the http://www.json.org/ manpage for more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Test-JSON-0.11-1.24.noarch.rpm"
RPM_HASH = "8844deb4421393dbb3b0bf9d39a96b7b66bf45c7a531802ef759b08db6b739c8df6575c735971b62b5a9d90821314983d9dd862a768b99c34243ff0a8d61d8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::JSON) \
perl-Test-JSON"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(JSON::Any) \
perl(Test::Differences) \
perl(Test::Tester)"

inherit rpm
