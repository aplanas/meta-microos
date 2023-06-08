SUMMARY = "Command line translator using various online services as backends"
DESCRIPTION = "Translate Shell is a command-line translator powered by \
Google Translate, Bing Translator, Yandex.Translate and DeepL \
traslator. It gives access to online translation services \
from a terminal."
LICENSE = "Unlicense"

PV = "0.9.7.1"

RPM_NAME = "translate-shell-0.9.7.1-1.1.noarch.rpm"
RPM_HASH = "1199075a8cd58ca3a7fb7170d0fe150d4bb9013ba3388bc839448fcfe58b2a9cf5f420387d1c51ac9a99eda2a54357585cfd994840f8888603aa753078cdb155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-shell"
RDEPENDS:${PN} += "/bin/bash bash gawk"

inherit rpm
