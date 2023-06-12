SUMMARY = "ASCII transliterations of Unicode text"
DESCRIPTION = "It often happens that you have text data in Unicode, but you need to \
represent it in ASCII. For example when integrating with legacy code that \
doesn't support Unicode, or for ease of entry of non-Roman names on a US \
keyboard, or when constructing ASCII machine identifiers from \
human-readable Unicode strings that should still be somewhat intelligible \
(a popular example of this is when making an URL slug from an article \
title). \
 \
In most of these examples you could represent Unicode characters as \
'???' or '\\\\15BA\\\\15A0\\\\1610', to mention two extreme cases. But that's \
nearly useless to someone who actually wants to read what the text says. \
 \
What Unidecode provides is a middle road: function unidecode() takes \
Unicode data and tries to represent it in ASCII characters (i.e., the \
universally displayable characters between 0x00 and 0x7F), where the \
compromises taken when mapping between two character sets are chosen to be \
near what a human with a US keyboard would choose. \
 \
The quality of resulting ASCII representation varies. For languages of \
western origin it should be between perfect and good. On the other hand \
transliteration (i.e., conveying, in Roman letters, the pronunciation \
expressed by the text in some other writing system) of languages like \
Chinese, Japanese or Korean is a very complex issue and this library does \
not even attempt to address it. It draws the line at context-free \
character-by-character mapping. So a good rule of thumb is that the further \
the script you are transliterating is from Latin alphabet, the worse the \
transliteration will be. \
 \
Note that this module generally produces better results than simply \
stripping accents from characters (which can be done in Python with \
built-in functions). It is based on hand-tuned character mappings that for \
example also contain ASCII approximations for symbols and non-Latin \
alphabets. \
 \
This is a Python port of Text::Unidecode Perl module by \
Sean M. Burke <sburke@cpan.org>."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "python310-Unidecode-1.3.6-1.4.noarch.rpm"
RPM_HASH = "5ad8bf9e56337fddbb3b47bdf9f43a7cf7329d4124b3e6754cb5b139343328ac79c77bf3cb572b98cf5e503ca56769b56316f91361d0970ad6643052433c511c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Unidecode \
python3.10dist(unidecode) \
python310-Unidecode \
python3dist(unidecode)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
