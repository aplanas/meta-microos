SUMMARY = "Core libraries of Mycroft's TTS engine"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "libttsmimic0-1.3.0.1-2.3.aarch64.rpm"
RPM_HASH = "c35077cf9081f52c43a444f9762e7c144b5b3c2cefdf4457cc6668c95e7296e4e95eec57935a2541ad913699442cb6aed48faa46dd40f4b2b4de977cb379dd92"

RPROVIDES:${PN} += "libttsmimic.so.0()(64bit) \
libttsmimic0 \
libttsmimic0(aarch-64) \
libttsmimic_lang_all_langs.so.0()(64bit) \
libttsmimic_lang_all_voices.so.0()(64bit) \
libttsmimic_lang_cmu_grapheme_lang.so.0()(64bit) \
libttsmimic_lang_cmu_grapheme_lex.so.0()(64bit) \
libttsmimic_lang_cmu_indic_lang.so.0()(64bit) \
libttsmimic_lang_cmu_indic_lex.so.0()(64bit) \
libttsmimic_lang_cmu_time_awb.so.0()(64bit) \
libttsmimic_lang_cmu_us_awb.so.0()(64bit) \
libttsmimic_lang_cmu_us_kal.so.0()(64bit) \
libttsmimic_lang_cmu_us_kal16.so.0()(64bit) \
libttsmimic_lang_cmu_us_rms.so.0()(64bit) \
libttsmimic_lang_cmu_us_slt.so.0()(64bit) \
libttsmimic_lang_cmu_us_slt_hts.so.0()(64bit) \
libttsmimic_lang_cmulex.so.0()(64bit) \
libttsmimic_lang_usenglish.so.0()(64bit) \
libttsmimic_lang_vid_gb_ap.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm
