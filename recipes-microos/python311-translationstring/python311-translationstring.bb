SUMMARY = "Utility library for i18n relied on by various Repoze and Pyramid packages"
DESCRIPTION = "A library used by various Pylons Project packages for internationalization \
(i18n) duties related to translation. \
 \
This package provides a translation string class, a translation string factory \
class, translation and pluralization primitives, and a utility that helps \
Chameleon templates use translation facilities of this package. It does not \
depend on Babel, but its translation and pluralization services are meant to \
work best when provided with an instance of the babel.support.Translations class."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python311-translationstring-1.4-2.12.noarch.rpm"
RPM_HASH = "d55e689aa29d224bf1b9d9510cc253933864227de506eb8b59cede38d30952e54800a75cec9c0f9bfb1e51102c008158625bd2a68c958f8e7ef57be0ff7219c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(translationstring) python311-translationstring python3dist(translationstring)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
