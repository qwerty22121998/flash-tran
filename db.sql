USE [FlashTrans]
GO
/****** Object:  Table [dbo].[user]    Script Date: 07/26/2018 22:42:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[user](
	[username] [nvarchar](255) NOT NULL,
	[fullname] [nvarchar](255) NOT NULL,
	[pwd] [nvarchar](255) NOT NULL,
	[email] [nvarchar](255) NOT NULL,
	[dob] [date] NOT NULL,
	[gender] [bit] NOT NULL,
	[phone] [nvarchar](50) NOT NULL,
	[address] [nvarchar](255) NOT NULL,
	[desc] [nvarchar](2048) NOT NULL,
 CONSTRAINT [PK_user] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[order]    Script Date: 07/26/2018 22:42:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order](
	[id] [int] NOT NULL,
	[uid] [nvarchar](255) NOT NULL,
	[shipid] [nvarchar](255) NULL,
	[start] [nvarchar](255) NOT NULL,
	[dest] [nvarchar](255) NOT NULL,
	[price] [nvarchar](255) NOT NULL,
	[startDate] [date] NOT NULL,
	[expiredDate] [date] NOT NULL,
	[rName] [nvarchar](255) NOT NULL,
	[rPhone] [nvarchar](255) NOT NULL,
	[desc] [nvarchar](2048) NULL,
	[name] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK_order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[feedback]    Script Date: 07/26/2018 22:42:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[feedback](
	[uid] [nvarchar](255) NOT NULL,
	[feedback] [nvarchar](2048) NOT NULL
) ON [PRIMARY]
GO
