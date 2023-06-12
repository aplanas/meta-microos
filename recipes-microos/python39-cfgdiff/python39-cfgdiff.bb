SUMMARY = "Cfgdiff -- diff(1) all your configuration files"
DESCRIPTION = "cfgdiff will try to parse your configuration files, fetching all \
the relevant keys and values from them and then pretty-printing \
them in the original format. \
These results are then diffed and the diff is shown to you. \
 \
cfgdiff currently supports the following formats: \
 - INI using Python's ConfigParser library \
 - JSON using Python's JSON library \
 - YAML if the Python YAML library is installed \
 - XML if the Python lxml library is installed"
LICENSE = "MIT"

PV = "0.0.0+git.1641843506.dc1234a"

RPM_NAME = "python39-cfgdiff-0.0.0+git.1641843506.dc1234a-1.7.noarch.rpm"
RPM_HASH = "d6203a0bc05681deed11e31391ed9462eb799bc6d93e8749b8fbb9b308d22c2666ea7d05d56d6b414900706635a19307faff94acf3c2a2d6b445acaee2757edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3.9dist(cfgdiff) \
python39-cfgdiff \
python3dist(cfgdiff)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-configobj \
python39-dnspython \
python39-lxml"

inherit rpm
