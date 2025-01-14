package com.snebula.android.file.util

import android.webkit.MimeTypeMap

internal val documentFileTypes: Map<String, String> = mapOf(
    "323" to "text/h323",
    "appcache" to "text/cache-manifest",
    "asc" to "text/plain",
    "bib" to "text/x-bibtex",
    "boo" to "text/x-boo",
    "brf" to "text/plain",
    "c" to "text/x-csrc",
    "c++" to "text/x-c++src",
    "cc" to "text/x-c++src",
    "cls" to "text/x-tex",
    "cpp" to "text/x-c++src",
    "csh" to "text/x-csh",
    "css" to "text/css",
    "csv" to "text/comma-separated-values",
    "cxx" to "text/x-c++src",
    "d" to "text/x-dsrc",
    "diff" to "text/plain",
    "doc" to "application/msword",
    "docm" to "application/vnd.ms-word.document.macroEnabled.12",
    "docx" to "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
    "dot" to "application/msword",
    "dotm" to "application/vnd.ms-word.template.macroEnabled.12",
    "dotx" to "application/vnd.openxmlformats-officedocument.wordprocessingml.template",
    "epub" to "application/epub+zip",
    "etx" to "text/x-setext",
    "gcd" to "text/x-pcs-gcd",
    "h" to "text/x-chdr",
    "h++" to "text/x-c++hdr",
    "hh" to "text/x-c++hdr",
    "hpp" to "text/x-c++hdr",
    "hs" to "text/x-haskell",
    "htc" to "text/x-component",
    "htm" to "text/html",
    "html" to "text/html",
    "hxx" to "text/x-c++hdr",
    "ics" to "text/calendar",
    "icz" to "text/calendar",
    "jad" to "text/vnd.sun.j2me.app-descriptor",
    "java" to "text/x-java",
    "lhs" to "text/x-literate-haskell",
    "ltx" to "text/x-tex",
    "ly" to "text/x-lilypond",
    "markdown" to "text/markdown",
    "md" to "text/markdown",
    "mml" to "text/mathml",
    "moc" to "text/x-moc",
    "p" to "text/x-pascal",
    "pas" to "text/x-pascal",
    "patch" to "text/x-diff",
    "pdf" to "application/pdf",
    "phps" to "text/text",
    "pl" to "text/x-perl",
    "pm" to "text/x-perl",
    "po" to "text/plain",
    "pot" to "application/vnd.ms-powerpoint",
    "potm" to "application/vnd.ms-powerpoint.template.macroEnabled.12",
    "potx" to "application/vnd.openxmlformats-officedocument.presentationml.template",
    "ppam" to "application/vnd.ms-powerpoint.addin.macroEnabled.12",
    "pps" to "application/vnd.ms-powerpoint",
    "ppsm" to "application/vnd.ms-powerpoint.slideshow.macroEnabled.12",
    "ppsx" to "application/vnd.openxmlformats-officedocument.presentationml.slideshow",
    "ppt" to "application/vnd.ms-powerpoint",
    "pptm" to "application/vnd.ms-powerpoint.presentation.macroEnabled.12",
    "pptx" to "application/vnd.openxmlformats-officedocument.presentationml.presentation",
    "py" to "text/x-python",
    "rtf" to "text/rtf",
    "scala" to "text/x-scala",
    "sct" to "text/scriptlet",
    "sfv" to "text/x-sfv",
    "sh" to "text/x-sh",
    "shtml" to "text/html",
    "sldm" to "application/vnd.ms-powerpoint.slide.macroEnabled.12",
    "sldx" to "application/vnd.openxmlformats-officedocument.presentationml.slide",
    "sty" to "text/x-tex",
    "tcl" to "text/x-tcl",
    "tex" to "text/x-tex",
    "text" to "text/plain",
    "thmx" to "application/vnd.ms-officetheme",
    "tk" to "text/x-tcl",
    "tm" to "text/texmacs",
    "tsv" to "text/tab-separated-values",
    "ttl" to "text/turtle",
    "txt" to "text/plain",
    "uls" to "text/iuls",
    "vcard" to "text/vcard",
    "vcf" to "text/x-vcard",
    "vcs" to "text/x-vcalendar",
    "wml" to "text/vnd.wap.wml",
    "wmls" to "text/vnd.wap.wmlscript",
    "wsc" to "text/scriptlet",
    "xlam" to "application/vnd.ms-excel.addin.macroEnabled.12",
    "xlb" to "application/vnd.ms-excel",
    "xls" to "application/vnd.ms-excel",
    "xlsb" to "application/vnd.ms-excel.sheet.binary.macroEnabled.12",
    "xlsm" to "application/vnd.ms-excel.sheet.macroEnabled.12",
    "xlsx" to "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
    "xlt" to "application/vnd.ms-excel",
    "xltm" to "application/vnd.ms-excel.template.macroEnabled.12",
    "xltx" to "application/vnd.openxmlformats-officedocument.spreadsheetml.template",
    "xml" to "text/xml",
)

internal val audioFileTypes: Map<String, String> = mapOf(
    "3ga" to "audio/3gpp",
    "a52" to "audio/ac3",
    "aac" to "audio/aac",
    "ac3" to "audio/ac3",
    "adt" to "audio/aac",
    "adts" to "audio/aac",
    "aif" to "audio/x-aiff",
    "aifc" to "audio/x-aiff",
    "aiff" to "audio/x-aiff",
    "amr" to "audio/amr",
    "au" to "audio/basic",
    "awb" to "audio/amr-wb",
    "axa" to "audio/annodex",
    "csd" to "audio/csound",
    "f4a" to "audio/mp4",
    "f4b" to "audio/mp4",
    "f4p" to "audio/mp4",
    "flac" to "audio/flac",
    "gsm" to "audio/x-gsm",
    "imy" to "audio/imelody",
    "kar" to "audio/midi",
    "m3u" to "audio/x-mpegurl",
    "m3u8" to "audio/x-mpegurl",
    "m4a" to "audio/mpeg",
    "m4b" to "audio/mp4",
    "m4p" to "audio/mp4",
    "m4r" to "audio/mpeg",
    "mid" to "audio/midi",
    "midi" to "audio/midi",
    "mka" to "audio/x-matroska",
    "mp1" to "audio/mpeg",
    "mp2" to "audio/mpeg",
    "mp3" to "audio/mpeg",
    "mpa" to "audio/mpeg",
    "mpega" to "audio/mpeg",
    "mpga" to "audio/mpeg",
    "mxmf" to "audio/mobile-xmf",
    "oga" to "audio/ogg",
    "ogg" to "audio/ogg",
    "opus" to "audio/ogg",
    "orc" to "audio/csound",
    "pls" to "audio/x-scpls",
    "ra" to "audio/x-pn-realaudio",
    "ram" to "audio/x-pn-realaudio",
    "rm" to "audio/x-pn-realaudio",
    "rtttl" to "audio/midi",
    "rtx" to "audio/midi",
    "sco" to "audio/csound",
    "sd2" to "audio/x-sd2",
    "sid" to "audio/prs.sid",
    "smf" to "audio/sp-midi",
    "snd" to "audio/basic",
    "spx" to "audio/ogg",
    "wav" to "audio/x-wav",
    "wax" to "audio/x-ms-wax",
    "wma" to "audio/x-ms-wma",
    "xmf" to "audio/midi",
)

internal val videoFileTypes: Map<String, String> = mapOf(
    "3g2" to "video/3gpp2",
    "3gp" to "video/3gpp",
    "3gp2" to "video/3gpp2",
    "3gpp" to "video/3gpp",
    "3gpp2" to "video/3gpp2",
    "asf" to "video/x-ms-asf",
    "asx" to "video/x-ms-asf",
    "avi" to "video/avi",
    "axv" to "video/annodex",
    "dif" to "video/dv",
    "dl" to "video/dl",
    "dv" to "video/dv",
    "f4v" to "video/mp4",
    "fli" to "video/fli",
    "flv" to "video/x-flv",
    "gl" to "video/gl",
    "lsf" to "video/x-la-asf",
    "lsx" to "video/x-la-asf",
    "m1v" to "video/mpeg",
    "m2t" to "video/mpeg",
    "m2ts" to "video/mp2t",
    "m2v" to "video/mpeg",
    "m4v" to "video/mp4",
    "mkv" to "video/x-matroska",
    "mng" to "video/x-mng",
    "mov" to "video/quicktime",
    "movie" to "video/x-sgi-movie",
    "mp1v" to "video/mpeg",
    "mp2v" to "video/mpeg",
    "mp4" to "video/mp4",
    "mp4v" to "video/mp4",
    "mpe" to "video/mpeg",
    "mpeg" to "video/mpeg",
    "mpeg1" to "video/mpeg",
    "mpeg2" to "video/mpeg",
    "mpeg4" to "video/mp4",
    "mpg" to "video/mpeg",
    "mpv" to "video/x-matroska",
    "mpv1" to "video/mpeg",
    "mpv2" to "video/mpeg",
    "mts" to "video/mp2t",
    "mxu" to "video/vnd.mpegurl",
    "ogv" to "video/ogg",
    "qt" to "video/quicktime",
    "ts" to "video/mp2ts",
    "webm" to "video/webm",
    "wm" to "video/x-ms-wm",
    "wmv" to "video/x-ms-wmv",
    "wmx" to "video/x-ms-wmx",
    "wrf" to "video/x-webex",
    "wvx" to "video/x-ms-wvx",
    "yt" to "video/vnd.youtube.yt",
)

internal val imageFileTypes: Map<String, String> = mapOf(
    "art" to "image/x-jg",
    "arw" to "image/x-sony-arw",
    "bmp" to "image/x-ms-bmp",
    "cdr" to "image/x-coreldraw",
    "cdt" to "image/x-coreldrawtemplate",
    "cpt" to "image/x-corelphotopaint",
    "cr2" to "image/x-canon-cr2",
    "crw" to "image/x-canon-crw",
    "cur" to "image/ico",
    "djv" to "image/vnd.djvu",
    "djvu" to "image/vnd.djvu",
    "dng" to "image/x-adobe-dng",
    "erf" to "image/x-epson-erf",
    "gif" to "image/gif",
    "heic" to "image/heic",
    "heics" to "image/heic-sequence",
    "heif" to "image/heif",
    "heifs" to "image/heif-sequence",
    "hif" to "image/heif",
    "ico" to "image/x-icon",
    "ief" to "image/ief",
    "jng" to "image/x-jng",
    "jp2" to "image/jp2",
    "jpe" to "image/jpeg",
    "jpeg" to "image/jpeg",
    "jpf" to "image/jpx",
    "jpg" to "image/jpeg",
    "jpg2" to "image/jp2",
    "jpm" to "image/jpm",
    "jpx" to "image/jpx",
    "nef" to "image/x-nikon-nef",
    "nrw" to "image/x-nikon-nrw",
    "orf" to "image/x-olympus-orf",
    "pat" to "image/x-coreldrawpattern",
    "pbm" to "image/x-portable-bitmap",
    "pcx" to "image/pcx",
    "pef" to "image/x-pentax-pef",
    "pgm" to "image/x-portable-graymap",
    "png" to "image/png",
    "pnm" to "image/x-portable-anymap",
    "ppm" to "image/x-portable-pixmap",
    "psd" to "image/x-photoshop",
    "raf" to "image/x-fuji-raf",
    "ras" to "image/x-cmu-raster",
    "rgb" to "image/x-rgb",
    "rw2" to "image/x-panasonic-rw2",
    "srw" to "image/x-samsung-srw",
    "svg" to "image/svg+xml",
    "svgz" to "image/svg+xml",
    "tif" to "image/tiff",
    "tiff" to "image/tiff",
    "wbmp" to "image/vnd.wap.wbmp",
    "webp" to "image/webp",
    "xbm" to "image/x-xbitmap",
    "xpm" to "image/x-xpixmap",
    "xwd" to "image/x-xwindowdump",
)

internal val archiveFileTypes: Map<String, String> = mapOf(
    "7z" to "application/x-7z-compressed",
    "gz" to "application/gzip",
    "tar" to "application/x-tar",
    "taz" to "application/x-gtar-compressed",
    "tgz" to "application/x-gtar-compressed",
    "zip" to "application/zip",
    "rar" to "application/rar",
    "xz" to "application/x-xz",
)

internal val androidPkgTypes: Map<String, String> = mapOf(
    "apk" to "application/vnd.android.package-archive",
)

internal val otherFileTypes: Map<String, String> = mapOf(
    "%" to "application/x-trash",
    "~" to "application/x-trash",
    "abw" to "application/x-abiword",
    "ai" to "application/postscript",
    "alc" to "chemical/x-alchemy",
    "anx" to "application/annodex",
    "application" to "application/x-ms-application",
    "asn" to "chemical/x-ncbi-asn1-spec",
    "aso" to "chemical/x-ncbi-asn1-binary",
    "atom" to "application/atom+xml",
    "atomcat" to "application/atomcat+xml",
    "atomsrv" to "application/atomserv+xml",
    "b" to "chemical/x-molconn-Z",
    "bak" to "application/x-trash",
    "bat" to "application/x-msdos-program",
    "bcpio" to "application/x-bcpio",
    "bin" to "application/octet-stream",
    "book" to "application/x-maker",
    "bsd" to "chemical/x-crossfire",
    "c3d" to "chemical/x-chem3d",
    "cab" to "application/x-cab",
    "cac" to "chemical/x-cache",
    "cache" to "chemical/x-cache",
    "cap" to "application/vnd.tcpdump.pcap",
    "cascii" to "chemical/x-cactvs-binary",
    "cat" to "application/vnd.ms-pki.seccat",
    "cbin" to "chemical/x-cactvs-binary",
    "cbr" to "application/x-cbr",
    "cbz" to "application/x-cbz",
    "cda" to "application/x-cdf",
    "cdf" to "application/x-cdf",
    "cdx" to "chemical/x-cdx",
    "cdy" to "application/vnd.cinderella",
    "cef" to "chemical/x-cxf",
    "cer" to "application/pkix-cert",
    "chm" to "chemical/x-chemdraw",
    "chrt" to "application/x-kchart",
    "cif" to "chemical/x-cif",
    "class" to "application/java-vm",
    "cmdf" to "chemical/x-cmdf",
    "cml" to "chemical/x-cml",
    "cod" to "application/vnd.rim.cod",
    "com" to "application/x-msdos-program",
    "cpa" to "chemical/x-compass",
    "cpio" to "application/x-cpio",
    "crl" to "application/x-pkcs7-crl",
    "crt" to "application/x-x509-ca-cert",
    "csf" to "chemical/x-cache-csf",
    "csm" to "chemical/x-csml",
    "csml" to "chemical/x-csml",
    "ctab" to "chemical/x-cactvs-binary",
    "ctx" to "chemical/x-ctx",
    "cu" to "application/cu-seeme",
    "cub" to "chemical/x-gaussian-cube",
    "cxf" to "chemical/x-cxf",
    "davmount" to "application/davmount+xml",
    "dcm" to "application/dicom",
    "dcr" to "application/x-director",
    "ddeb" to "application/vnd.debian.binary-package",
    "deb" to "application/x-debian-package",
    "deploy" to "application/octet-stream",
    "dfxp" to "application/ttml+xml",
    "dir" to "application/x-director",
    "dll" to "application/x-msdos-program",
    "dmg" to "application/x-apple-diskimage",
    "dms" to "application/x-dms",
    "dvi" to "application/x-dvi",
    "dx" to "chemical/x-jcamp-dx",
    "dxr" to "application/x-director",
    "emb" to "chemical/x-embl-dl-nucleotide",
    "embl" to "chemical/x-embl-dl-nucleotide",
    "eml" to "message/rfc822",
    "ent" to "chemical/x-pdb",
    "eot" to "application/vnd.ms-fontobject",
    "eps" to "application/postscript",
    "eps2" to "application/postscript",
    "eps3" to "application/postscript",
    "epsf" to "application/postscript",
    "epsi" to "application/postscript",
    "es" to "application/ecmascript",
    "exe" to "application/x-msdos-program",
    "ez" to "application/andrew-inset",
    "fb" to "application/x-maker",
    "fbdoc" to "application/x-maker",
    "fch" to "chemical/x-gaussian-checkpoint",
    "fchk" to "chemical/x-gaussian-checkpoint",
    "fig" to "application/x-xfig",
    "fl" to "application/x-android-drm-fl",
    "fm" to "application/x-maker",
    "frame" to "application/x-maker",
    "frm" to "application/x-maker",
    "gal" to "chemical/x-gaussian-log",
    "gam" to "chemical/x-gamess-input",
    "gamin" to "chemical/x-gamess-input",
    "gan" to "application/x-ganttproject",
    "gau" to "chemical/x-gaussian-input",
    "gcf" to "application/x-graphing-calculator",
    "gcg" to "chemical/x-gcg8-sequence",
    "gen" to "chemical/x-genbank",
    "gf" to "application/x-tex-gf",
    "gjc" to "chemical/x-gaussian-input",
    "gjf" to "chemical/x-gaussian-input",
    "gnumeric" to "application/x-gnumeric",
    "gpt" to "chemical/x-mopac-graph",
    "gsf" to "application/x-font",
    "gtar" to "application/x-gtar",
    "hdf" to "application/x-hdf",
    "hin" to "chemical/x-hin",
    "hqx" to "application/mac-binhex40",
    "hta" to "application/hta",
    "hwp" to "application/x-hwp",
    "ica" to "application/x-ica",
    "ice" to "x-conference/x-cooltalk",
    "iges" to "model/iges",
    "igs" to "model/iges",
    "iii" to "application/x-iphone",
    "info" to "application/x-info",
    "inp" to "chemical/x-gamess-input",
    "ins" to "application/x-internet-signup",
    "iso" to "application/x-iso9660-image",
    "isp" to "application/x-internet-signup",
    "ist" to "chemical/x-isostar",
    "istr" to "chemical/x-isostar",
    "jam" to "application/x-jam",
    "jar" to "application/java-archive",
    "jdx" to "chemical/x-jcamp-dx",
    "jmz" to "application/x-jmol",
    "jnlp" to "application/x-java-jnlp-file",
    "js" to "application/javascript",
    "json" to "application/json",
    "jsonld" to "application/ld+json",
    "key" to "application/pgp-keys",
    "kil" to "application/x-killustrator",
    "kin" to "chemical/x-kinemage",
    "kml" to "application/vnd.google-earth.kml+xml",
    "kmz" to "application/vnd.google-earth.kmz",
    "kpr" to "application/x-kpresenter",
    "kpt" to "application/x-kpresenter",
    "ksp" to "application/x-kspread",
    "kwd" to "application/x-kword",
    "kwt" to "application/x-kword",
    "latex" to "application/x-latex",
    "lha" to "application/x-lha",
    "lin" to "application/bbolin",
    "lrc" to "application/lrc",
    "lyx" to "application/x-lyx",
    "lzh" to "application/x-lzh",
    "lzx" to "application/x-lzx",
    "m3g" to "application/m3g",
    "maker" to "application/x-maker",
    "man" to "application/x-troff-man",
    "manifest" to "application/x-ms-manifest",
    "mbox" to "application/mbox",
    "mcif" to "chemical/x-mmcif",
    "mcm" to "chemical/x-macmolecule",
    "mdb" to "application/msaccess",
    "me" to "application/x-troff-me",
    "mesh" to "model/mesh",
    "mif" to "application/x-mif",
    "mjs" to "application/javascript",
    "mm" to "application/x-freemind",
    "mmd" to "chemical/x-macromodel-input",
    "mmf" to "application/vnd.smaf",
    "mmod" to "chemical/x-macromodel-input",
    "mobi" to "application/x-mobipocket-ebook",
    "mol" to "chemical/x-mdl-molfile",
    "mol2" to "chemical/x-mol2",
    "moo" to "chemical/x-mopac-out",
    "mop" to "chemical/x-mopac-input",
    "mopcrt" to "chemical/x-mopac-input",
    "mpc" to "chemical/x-mopac-input",
    "mph" to "application/x-comsol",
    "ms" to "application/x-troff-ms",
    "msh" to "model/mesh",
    "msi" to "application/x-msi",
    "msp" to "application/octet-stream",
    "msu" to "application/octet-stream",
    "mvb" to "chemical/x-mopac-vib",
    "mxf" to "application/mxf",
    "nb" to "application/mathematica",
    "nbp" to "application/mathematica",
    "nc" to "application/x-netcdf",
    "nwc" to "application/x-nwc",
    "o" to "application/x-object",
    "oda" to "application/oda",
    "odb" to "application/vnd.oasis.opendocument.database",
    "odc" to "application/vnd.oasis.opendocument.chart",
    "odf" to "application/vnd.oasis.opendocument.formula",
    "odg" to "application/vnd.oasis.opendocument.graphics",
    "odi" to "application/vnd.oasis.opendocument.image",
    "odm" to "application/vnd.oasis.opendocument.text-master",
    "odp" to "application/vnd.oasis.opendocument.presentation",
    "ods" to "application/vnd.oasis.opendocument.spreadsheet",
    "odt" to "application/vnd.oasis.opendocument.text",
    "ogx" to "application/ogg",
    "old" to "application/x-trash",
    "one" to "application/onenote",
    "onepkg" to "application/onenote",
    "onetmp" to "application/onenote",
    "onetoc2" to "application/onenote",
    "opf" to "application/oebps-package+xml",
    "ota" to "application/vnd.android.ota",
    "otf" to "font/ttf",
    "otg" to "application/vnd.oasis.opendocument.graphics-template",
    "oth" to "application/vnd.oasis.opendocument.text-web",
    "otp" to "application/vnd.oasis.opendocument.presentation-template",
    "ots" to "application/vnd.oasis.opendocument.spreadsheet-template",
    "ott" to "application/vnd.oasis.opendocument.text-template",
    "oza" to "application/x-oz-application",
    "p12" to "application/x-pkcs12",
    "p7r" to "application/x-pkcs7-certreqresp",
    "pac" to "application/x-ns-proxy-autoconfig",
    "pcap" to "application/vnd.tcpdump.pcap",
    "pcf.Z" to "application/x-font-pcf",
    "pcf" to "application/x-font",
    "pdb" to "chemical/x-pdb",
    "pem" to "application/x-pem-file",
    "pfa" to "application/x-font",
    "pfb" to "application/x-font",
    "pfr" to "application/font-tdpfr",
    "pfx" to "application/x-pkcs12",
    "pgn" to "application/x-chess-pgn",
    "pgp" to "application/pgp-signature",
    "pk" to "application/x-tex-pk",
    "prc" to "application/x-mobipocket-ebook",
    "prf" to "application/pics-rules",
    "prt" to "chemical/x-ncbi-asn1-ascii",
    "ps" to "application/postscript",
    "pyc" to "application/x-python-code",
    "pyo" to "application/x-python-code",
    "qgs" to "application/x-qgis",
    "qtl" to "application/x-quicktimeplayer",
    "rb" to "application/x-ruby",
    "rd" to "chemical/x-mdl-rdfile",
    "rdf" to "application/rdf+xml",
    "rdp" to "application/x-rdp",
    "roff" to "application/x-troff",
    "ros" to "chemical/x-rosdal",
    "rpm" to "application/x-redhat-package-manager",
    "rss" to "application/rss+xml",
    "rxn" to "chemical/x-mdl-rxnfile",
    "sce" to "application/x-scilab",
    "sci" to "application/x-scilab",
    "scr" to "application/x-silverlight",
    "sd" to "chemical/x-mdl-sdfile",
    "sda" to "application/vnd.stardivision.draw",
    "sdc" to "application/vnd.stardivision.calc",
    "sdd" to "application/vnd.stardivision.impress",
    "sdf" to "chemical/x-mdl-sdfile",
    "sdp" to "application/vnd.stardivision.impress",
    "sds" to "application/vnd.stardivision.chart",
    "sdw" to "application/vnd.stardivision.writer",
    "ser" to "application/java-serialized-object",
    "sfd" to "application/vnd.font-fontforge-sfd",
    "sgf" to "application/x-go-sgf",
    "sgl" to "application/vnd.stardivision.writer-global",
    "shar" to "application/x-shar",
    "shp" to "application/x-qgis",
    "shx" to "application/x-qgis",
    "sig" to "application/pgp-signature",
    "sik" to "application/x-trash",
    "silo" to "model/mesh",
    "sis" to "application/vnd.symbian.install",
    "sisx" to "x-epoc/x-sisx-app",
    "sit" to "application/x-stuffit",
    "sitx" to "application/x-stuffit",
    "skd" to "application/x-koan",
    "skm" to "application/x-koan",
    "skp" to "application/x-koan",
    "skt" to "application/x-koan",
    "smi" to "application/smil+xml",
    "smil" to "application/smil+xml",
    "spc" to "chemical/x-galactic-spc",
    "spl" to "application/x-futuresplash",
    "sql" to "application/x-sql",
    "src" to "application/x-wais-source",
    "srt" to "application/x-subrip",
    "stc" to "application/vnd.sun.xml.calc.template",
    "std" to "application/vnd.sun.xml.draw.template",
    "sti" to "application/vnd.sun.xml.impress.template",
    "stl" to "application/vnd.ms-pki.stl",
    "stw" to "application/vnd.sun.xml.writer.template",
    "sv4cpio" to "application/x-sv4cpio",
    "sv4crc" to "application/x-sv4crc",
    "sw" to "chemical/x-swissprot",
    "swf" to "application/x-shockwave-flash",
    "swfl" to "application/x-shockwave-flash",
    "sxc" to "application/vnd.sun.xml.calc",
    "sxd" to "application/vnd.sun.xml.draw",
    "sxg" to "application/vnd.sun.xml.writer.global",
    "sxi" to "application/vnd.sun.xml.impress",
    "sxm" to "application/vnd.sun.xml.math",
    "sxw" to "application/vnd.sun.xml.writer",
    "t" to "application/x-troff",
    "texi" to "application/x-texinfo",
    "texinfo" to "application/x-texinfo",
    "tgf" to "chemical/x-mdl-tgf",
    "torrent" to "application/x-bittorrent",
    "tr" to "application/x-troff",
    "tsp" to "application/dsptype",
    "ttc" to "font/collection",
    "ttf" to "font/ttf",
    "ttml" to "application/ttml+xml",
    "udeb" to "application/x-debian-package",
    "ustar" to "application/x-ustar",
    "val" to "chemical/x-ncbi-asn1-binary",
    "vcd" to "application/x-cdlink",
    "vmd" to "chemical/x-vmd",
    "vms" to "chemical/x-vamas-iso14976",
    "vor" to "application/vnd.stardivision.writer",
    "vrm" to "x-world/x-vrml",
    "vrml" to "x-world/x-vrml",
    "vsd" to "application/vnd.visio",
    "vss" to "application/vnd.visio",
    "vst" to "application/vnd.visio",
    "vsw" to "application/vnd.visio",
    "wad" to "application/x-doom",
    "wasm" to "application/wasm",
    "wbxml" to "application/vnd.wap.wbxml",
    "webarchive" to "application/x-webarchive",
    "webarchivexml" to "application/x-webarchive-xml",
    "wk" to "application/x-123",
    "wmd" to "application/x-ms-wmd",
    "wmlc" to "application/vnd.wap.wmlc",
    "wmlsc" to "application/vnd.wap.wmlscriptc",
    "wmz" to "application/x-ms-wmz",
    "woff" to "font/woff",
    "woff2" to "font/woff2",
    "wp5" to "application/vnd.wordperfect5.1",
    "wpd" to "application/vnd.wordperfect",
    "wpl" to "application/vnd.ms-wpl",
    "wrl" to "x-world/x-vrml",
    "wz" to "application/x-wingz",
    "x3d" to "model/x3d+xml",
    "x3db" to "model/x3d+binary",
    "x3dv" to "model/x3d+vrml",
    "xcf" to "application/x-xcf",
    "xcos" to "application/x-scilab-xcos",
    "xht" to "application/xhtml+xml",
    "xhtml" to "application/xhtml+xml",
    "xpi" to "application/x-xpinstall",
    "xsd" to "application/xml",
    "xsl" to "application/xslt+xml",
    "xslt" to "application/xslt+xml",
    "xspf" to "application/xspf+xml",
    "xtel" to "chemical/x-xtel",
    "xul" to "application/vnd.mozilla.xul+xml",
    "xyz" to "chemical/x-xyz",
    "zmt" to "chemical/x-mopac-input",
)

internal val generalFileTypes: Map<String, String> = documentFileTypes + audioFileTypes +
    videoFileTypes + imageFileTypes + archiveFileTypes + androidPkgTypes

internal val allFileTypes: Map<String, String> = generalFileTypes + otherFileTypes

internal fun String.extension2MimeType(): String? {
    val ext = lowercase()
    return MimeTypeMap.getSingleton().getMimeTypeFromExtension(ext) ?: allFileTypes[ext]
}

internal fun String.mimeType2Extension(): String? {
    val mime = lowercase()
    return MimeTypeMap.getSingleton().getExtensionFromMimeType(mime)
        ?: allFileTypes.filterValues { it == mime }.keys.firstOrNull()
}

internal inline val String?.mimeCompat: String get() = this ?: "*/*"
