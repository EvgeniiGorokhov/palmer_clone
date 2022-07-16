SELECT COUNT(*)*100/(SELECT COUNT(*) From orders) RESULT
FROM [dbo].[orders] o 
JOIN [dbo].[promocodes] p ON p.[promocode_id]=o.[promocode_id]